package com.manage.model;

import jakarta.persistence.*;

@Entity
@Table(name="StuData")

public class StuData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Course")
	private String course;

	public StuData() {
		
	}

	public StuData(String name, String course) {
		this.name = name;
		this.course = course;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StuData [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	
}
