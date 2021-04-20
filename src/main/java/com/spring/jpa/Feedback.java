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
@Table(name="feedback")
public class Feedback {
	
	@Id
	@Column(name="feedid")
	private int feedId;

	@Column(name="comment")
	private String comment;
	
	@Column(name="custid")
	private int custid;
	
	@Column(name="reservationid")
	private int reservationId;

	public Feedback(String comment, int custid, int reservationId) {
		this.comment = comment;
		this.custid = custid;
		this.reservationId = reservationId;
	}
	
	public Feedback(int feedId, String comment, int custid, int reservationId) {
		this.feedId = feedId;
		this.comment = comment;
		this.custid = custid;
		this.reservationId = reservationId;
	}

	public int getFeedId() {
		return feedId;
	}

	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
}
