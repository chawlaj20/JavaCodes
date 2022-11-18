package com.entity;

import jakarta.persistence.*;

@Entity 
@Table(name="Admin")

public class Admin {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="Admin_detail_id")
    private Admindetails admindetails;

	public Admin() {
		
	}

	public Admin( String firstName, String lastName, String email) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Admindetails getAdmindetails() {
		return admindetails;
	}

	public void setAdmindetails(Admindetails admindetails) {
		this.admindetails = admindetails;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", admindetails=" + admindetails + "]";
	}
	
	
	

    
}
