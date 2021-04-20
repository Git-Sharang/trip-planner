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
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name = "custid")
	private int custId;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "province")
	private String province;
	
	@Column(name = "pcode")
	private String pcode;
	
	@Column(name = "country")
	private String country;

	public Customer() {
		
	}	

	public Customer(String email, String password, String firstname, String lastname, String phone,
			String address, String city, String province, String pcode, String country) {
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.province = province;
		this.pcode = pcode;
		this.country = country;
	}

	public Customer(int custId, String email, String password, String firstname, String lastname, String phone,
			String address, String city, String province, String pcode, String country) {
		this.custId = custId;
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.province = province;
		this.pcode = pcode;
		this.country = country;
	}

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
