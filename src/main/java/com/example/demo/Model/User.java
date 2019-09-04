package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends ParentEntity {

	private static final long serialVersionUID = -3103768630750199000L;

	@Column(unique = false, nullable = false)
	private String firstName;

	@Column(unique = false, nullable = true)
	private String secondName;

	@Column(unique = false, nullable = false)
	private String firstSurname;

	@Column(unique = false, nullable = true)
	private String secondSurname;

	@Column(unique = false, nullable = true)
	private String phone;

	@Column(unique = false, nullable = false)
	private String address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFirstSurname() {
		return firstSurname;
	}

	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
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

}
