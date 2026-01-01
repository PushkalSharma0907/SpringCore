package com.first;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.annotation.processing.Generated;
import javax.persistence.*;


@Entity
@Table(name="Student_Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Address_ID")
	private int addId;
	
	@Column(length=100,name="CITY")
	private String city;
	
	@Column(length=100,name="STREET")
	private String street;
	
	@Column(name="IS_OPEN")
	private boolean isOpen ;
	
	@Transient
	private double x;
	
	@Column(length=100,name="Added_DATE")
	private LocalDateTime date;
	
	@Lob
	private byte[] image ;

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", street=" + street + ", isOpen=" + isOpen + ", x=" + x
				+ ", date=" + date + ", image=" + Arrays.toString(image) + "]";
	}

	public Address(int addId, String city, String street, boolean isOpen, double x, LocalDateTime date, byte[] image) {
		super();
		this.addId = addId;
		this.city = city;
		this.street = street;
		this.isOpen = isOpen;
		this.x = x;
		this.date = date;
		this.image = image;
	}
	
	public Address() {}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

}
