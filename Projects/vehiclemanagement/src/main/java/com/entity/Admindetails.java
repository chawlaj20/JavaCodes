package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name="admindetails")

public class Admindetails {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    //variables
    @Column(name="id")
    private int id;
	
	@Column(name="vehicletype")
	private String vehicletype;

	
	@Column(name="vehiclename")
	private String vehiclename;
	
	@OneToOne(mappedBy="admindetails", cascade=CascadeType.ALL)
    private Admin admin;

	public Admindetails() {
		
	}

	public Admindetails( String vehicletype, String vehiclename) {
		this.vehicletype = vehicletype;
		this.vehiclename = vehiclename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicletype() {
		return vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}

	public String getVehiclename() {
		return vehiclename;
	}

	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Admindetails [id=" + id + ", vehicletype=" + vehicletype + ", vehiclename=" + vehiclename + "]";
	}
	
	
	
	
	
	
	
	
}
