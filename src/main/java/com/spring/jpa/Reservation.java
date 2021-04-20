/* Name: Sharang Verma
 * Student Number: 300981587
 * Submission Date: March 7, 2021
 * */
package com.spring.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@Column(name = "reservationid")
	private int reservationId;
	
	@Column(name = "noofrooms")
	private int noOfRooms;
	
	@Column(name = "noofpeople")
	private int noOfPeople;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "noofnights")
	private int noOfNights;
	
	@Column(name = "custid")
	private int custId;
	
	@Column(name = "roomid")
	private int roomId;
	
	@Column(name = "departuredate")
	private String departureDate;
	
	@Column(name = "returndate")
	private String returnDate;

	public Reservation() {
		
	}
	
	public Reservation(int reservationId, int noOfRooms, int noOfPeople, int amount, int noOfNights, int custId,
			int roomId, String departureDate, String returnDate) {
		this.reservationId = reservationId;
		this.noOfRooms = noOfRooms;
		this.noOfPeople = noOfPeople;
		this.amount = amount;
		this.noOfNights = noOfNights;
		this.custId = custId;
		this.roomId = roomId;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
	}
	
	public Reservation(int noOfRooms, int noOfPeople, int amount, int noOfNights, int custId,
			int roomId, String departureDate, String returnDate) {
		this.noOfRooms = noOfRooms;
		this.noOfPeople = noOfPeople;
		this.amount = amount;
		this.noOfNights = noOfNights;
		this.custId = custId;
		this.roomId = roomId;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public int getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getNoOfNights() {
		return noOfNights;
	}

	public void setNoOfNights(int noOfNights) {
		this.noOfNights = noOfNights;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
}
