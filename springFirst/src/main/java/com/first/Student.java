package com.first;



import javax.persistence.*;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.ref.Certificate;


@Entity  // This annotation is used to specify that the class is an entity and is mapped to a database table.
//@Cacheable
//@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name="student")  // This annotation is used to specify the table name in the database.
public class Student {
	
	@Id  // This annotation is used to specify the primary key of an entity.
	private int id;
	private String name;
	private String city;
	private Certificate certificate; // we are not using @Embedded here, because Certificate is not an entity, it's a simple class.
	
public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	//	By default, it doesn't guarantee the order of fields as declared in the source code
//	column ka order kuch v ho skta h, by default.
	public Student() {
		super();
	}
	
	public Student(int id, String name, String city, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certificate = certificate;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", city=" + city + ", certificate=" + certificate + "]";
	}
	
	

}
