/* Name: Sharang Verma
 * Student Number: 300981587
 * Submission Date: March 7, 2021
 * */
package com.spring.jpa;

import java.time.LocalDate;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.tagext.ValidationMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerAppController {

	@Autowired
	private CustomerRepository custRepository;
	
	@Autowired
	private FeedbackRepository feedRepository;
	
	@Autowired
	private ReservationRepository resRepository;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	@PostMapping("/signin")
	public String SignIn(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, Model model) {
		
		int custId = getCustomerId(email, password);
		if(custId == 0) {
			model.addAttribute("exceptionMessage", "Please check your credentials");
			return "index";
		} else {
			//HttpSession session = request.getSession();
			session.setAttribute("customerIdNo", custId);
			return "redirect:/home";	
		}
	}
	
	@GetMapping("/register")
	public String Signup() {
		return "signup";
	}
	@PostMapping("/register")
	public String add(@RequestParam("email") String email, @RequestParam("password") String password, 
			@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, 
			@RequestParam("phone") String phone, @RequestParam("address") String address, @RequestParam("city") String city, 
			@RequestParam("province")String province, @RequestParam("pCode") String pcode, @RequestParam("country")String country, Model model, HttpSession session) {
		if (checkCustomer(email) == false) {
			Customer customer = new Customer(email, password, firstname, lastname, phone, address, city, province, pcode, country);
			custRepository.save(customer);
			int custId = getCustomerId(email, password);
			session.setAttribute("customerIdNo", custId);
			return "redirect:/home";
		} else {
			model.addAttribute("exceptionMessage", "Email already exists, please register with a diferrent email");
			return "signup";	
		}
	}
	
	@GetMapping("/profile")
	public String ProfilePage(HttpSession session, Model model) {
		int customerId = (int) session.getAttribute("customerIdNo");
		model.addAttribute("customerInfo", custRepository.findByCustId(customerId));
		return "profile";
	}
	@PostMapping("/updateProfile")
	public String ProfileUpdate(@RequestParam("email") String email, @RequestParam("password") String password, 
	@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, @RequestParam("phone") String phone, @RequestParam("address") String address, @RequestParam("city") String city, 
			@RequestParam("province")String province, @RequestParam("pCode") String pcode, @RequestParam("country")String country, Model model, HttpSession session) {
		int customerId = (int) session.getAttribute("customerIdNo");	
		Customer customer = new Customer(customerId, email, password, firstname, lastname, phone, address, city, province, pcode, country);
		custRepository.save(customer);
		return "redirect:/home";
	}
	
	
	@GetMapping("/feedback")
	public String FeedbackPage(HttpSession session) {
		session.getAttribute("customerIdNo");
		return "feedback";
	}
	@PostMapping("/giveFeedback")
	public String AddFeedback(@RequestParam("comment") String comment, @RequestParam("reservation") int reservationId, 
			Model model, HttpSession session) {
		int customerId = (int) session.getAttribute("customerIdNo");
		if (checkReservationExistence(reservationId) == true) {
			Feedback feedback = new Feedback(comment, customerId, reservationId);
			feedRepository.save(feedback);
			return "feedbackConfirmation";
		} else {
			model.addAttribute("exceptionMessage", "Reservation doesnot exists");
			return "feedback";
		}
	}
	
	
	
	
	public boolean checkCustomer(String email) {
		Customer customer = custRepository.findByEmail(email);
		if(customer != null) {
			return true;
		}
		return false;
	}
	
	public boolean checkCustomerPassword(String email, String password) {
		String custPassword;
		Customer customer = custRepository.findByEmail(email);
		custPassword = customer.getPassword();
		if(custPassword.equals(password)) {
			return true;
		}
		return false;
	}
	
	public int getCustomerId(String email, String password) {
		int custId = 0;
		String custPassword;
		Customer customer = custRepository.findByEmail(email);
		if(customer != null) {
			custPassword = customer.getPassword();
			if(custPassword.equals(password)) {
				custId = customer.getCustId();
			} else {
				System.out.println("please check your password");
			}
		} else {
			System.out.println("The customer doesnot exists please register");
		}
		return custId;
	}
	
	public boolean checkReservationExistence(int reservationId) {
		if (resRepository.findByReservationId(reservationId) != null) {
			return true;
		}
		return false;
	}
}
