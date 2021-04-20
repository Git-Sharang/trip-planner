/* Name: Sharang Verma
 * Student Number: 300981587
 * Submission Date: March 7, 2021
 * */
package com.spring.jpa;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationAppController {

	@Autowired
	private ReservationRepository resRepository;

	@GetMapping("/home")
	public String HomePage(Model model, HttpSession session) {
		int customerId = (int) session.getAttribute("customerIdNo");
		model.addAttribute("reservations", resRepository.findByCustIdOrderByDepartureDateAsc(customerId));
		System.out.println("This is the id stored in the session: " + customerId);
		return "home";
	}

	@GetMapping("/booking")
	public String MakeReservation() {
		return "reservation";
	}

	@PostMapping("/booking")
	public String add(@RequestParam("departureDate") String departureDate,
			@RequestParam("returnDate") String returnDate, @RequestParam("noOfAdults") int noOfAdults,
			@RequestParam("noOfKids") int noOfKids, @RequestParam("roomType") String roomType,
			@RequestParam("noOfNights") int noOfNights, @RequestParam("noOfRooms") int noOfRooms, Model model,
			HttpSession session) {
		int roomId = 0, roomPrice = 0, amount = 0, numberOfPeople = 0;
		int customerId = (int) session.getAttribute("customerIdNo");
		if (roomType.equals("Ocean View - $150 per night")) {
			roomId = 1;
			roomPrice = 150;
			numberOfPeople = noOfAdults + noOfKids;
			amount = CalculateFare(numberOfPeople, noOfNights, roomPrice, noOfRooms);

			Reservation reservation = new Reservation(noOfRooms, numberOfPeople, amount, noOfNights, customerId, roomId,
					departureDate, returnDate);
			resRepository.save(reservation);
			System.out.println("reservation successfull");
			return "payment";

		}
		if (roomType.equals("Mountain View - $175 per night")) {
			roomId = 2;
			roomPrice = 175;
			numberOfPeople = noOfAdults + noOfKids;
			amount = CalculateFare(numberOfPeople, noOfNights, roomPrice, noOfRooms);

			Reservation reservation = new Reservation(noOfRooms, numberOfPeople, amount, noOfNights, customerId, roomId,
					departureDate, returnDate);
			resRepository.save(reservation);
			System.out.println("reservation successfull");
			return "payment";

		}
		if (roomType.equals("Resort View - $130 per night")) {
			roomId = 3;
			roomPrice = 130;
			numberOfPeople = noOfAdults + noOfKids;
			amount = CalculateFare(numberOfPeople, noOfNights, roomPrice, noOfRooms);

			Reservation reservation = new Reservation(noOfRooms, numberOfPeople, amount, noOfNights, customerId, roomId,
					departureDate, returnDate);
			resRepository.save(reservation);
			System.out.println("reservation successfull");
			return "payment";
		}
		model.addAttribute("exceptionMessage", "Some error in making the reservation");
		return "reservation";
	}

	@PostMapping("/thankyou")
	public String finalStep() {
		return "confirmation";
	}
	
	
	
	@PostMapping("/update")
	public String EditReservation(@RequestParam("reservationId") int reservationId, HttpSession session, Model model) {
		if (checkReservationExistence(reservationId) == true) {
			session.setAttribute("reservationIdNo", reservationId);
			model.addAttribute("reservations", resRepository.findByReservationId(reservationId));
			return "editReservation";
		}
		model.addAttribute("updateExceptionMessage", "Reservation doesnot exists");
		return "redirect:/home";
	}

	@PostMapping("/proceedUpdate")
	public String update(@RequestParam("departureDate") String departureDate,
			@RequestParam("returnDate") String returnDate, @RequestParam("noOfAdults") int noOfAdults,
			@RequestParam("noOfKids") int noOfKids, @RequestParam("roomType") String roomType,
			@RequestParam("noOfNights") int noOfNights, @RequestParam("noOfRooms") int noOfRooms, Model model,
			HttpSession session) {
		int roomId = 0, roomPrice = 0, amount = 0, numberOfPeople = 0;
		int customerId = (int) session.getAttribute("customerIdNo");
		int reservationId = (int) session.getAttribute("reservationIdNo");

		// Counting the Days for the update, they should be less more than 2 days
		LocalDate departureCheckDate = ConvertStringToDate(departureDate);
		long days = daysBetweenDates(departureCheckDate);
		if (days > 2) {
			if (roomType.equals("Ocean View - $150 per night")) {
				roomId = 1;
				roomPrice = 150;
				numberOfPeople = noOfAdults + noOfKids;
				amount = CalculateFare(numberOfPeople, noOfNights, roomPrice, noOfRooms);

				Reservation reservation = new Reservation(reservationId, noOfRooms, numberOfPeople, amount, noOfNights,
						customerId, roomId, departureDate, returnDate);
				resRepository.save(reservation);
				System.out.println("reservation successfull");
				return "redirect:/home";

			} else if (roomType.equals("Mountain View - $175 per night")) {
				roomId = 2;
				roomPrice = 175;
				numberOfPeople = noOfAdults + noOfKids;
				amount = CalculateFare(numberOfPeople, noOfNights, roomPrice, noOfRooms);

				Reservation reservation = new Reservation(reservationId, noOfRooms, numberOfPeople, amount, noOfNights,
						customerId, roomId, departureDate, returnDate);
				resRepository.save(reservation);
				System.out.println("reservation successfull");
				return "redirect:/home";

			} else if (roomType.equals("Resort View - $130 per night")) {
				roomId = 3;
				roomPrice = 130;
				numberOfPeople = noOfAdults + noOfKids;
				amount = CalculateFare(numberOfPeople, noOfNights, roomPrice, noOfRooms);

				Reservation reservation = new Reservation(reservationId, noOfRooms, numberOfPeople, amount, noOfNights,
						customerId, roomId, departureDate, returnDate);
				resRepository.save(reservation);
				System.out.println("reservation successfull");
				return "redirect:/home";
			} else {
				model.addAttribute("updateExceptionMessage", "Some error in making the reservation");
				return "editReservation";
			}
		} else {
			model.addAttribute("updateExceptionMessage", "Cannot change the Reservation, it's too late");
			return "editReservation";
		}
	}

	@PostMapping("/cancelReservation")
	public String deleteDepartment(@RequestParam("reservationId") int reservationId, HttpSession session, Model model) {

		if (checkReservationExistence(reservationId) == true) {

			Reservation reservation = resRepository.findByReservationId(reservationId);

			// Counting the Days for the update, they should be less more than 2 days
			LocalDate departureCheckDate = ConvertStringToDate(reservation.getDepartureDate());
			long days = daysBetweenDates(departureCheckDate);
			if (days > 2) {
				resRepository.deleteById(reservationId);
				return "redirect:/home";
			} else {
				model.addAttribute("exceptionMessage", "Cannot cancel the Reservation, it's too late");
				return "error";
			}

		} else {
			model.addAttribute("exceptionMessage", "Reservation doesnot exists");
			return "error";
		}

	}

	public int CalculateFare(int noofPeople, int noofNights, int amount, int noOfRooms) {
		return noofPeople * noofNights * amount * noOfRooms;
	}

	public boolean checkReservationExistence(int reservationId) {
		if (resRepository.findByReservationId(reservationId) != null) {
			return true;
		}
		return false;
	}

	public long daysBetweenDates(LocalDate arrival) {
		LocalDate dateToday = LocalDate.now();
		long daysBetween = ChronoUnit.DAYS.between(dateToday, arrival);
		return daysBetween;
	}

	public LocalDate ConvertStringToDate(String arrivalDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(arrivalDate, formatter);
		return date;
	}
}
