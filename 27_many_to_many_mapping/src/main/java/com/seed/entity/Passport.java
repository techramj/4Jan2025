package com.seed.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="passport4")
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pass2_id_seq")
	@SequenceGenerator(name="pass2_id_seq", sequenceName = "passport4_id_seq", initialValue = 10000)
	@Column(name="passport_id")
	private Long passportId;

	@Column(name="passport_number")
	private String passportNumber;
	
	@Column(name="expiry_date")
	private Date expiryDate;

	public Long getPassportId() {
		return passportId;
	}

	public void setPassportId(Long passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}
	

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = new Date(expiryDate.toEpochDay());
	}

}
