package com.sports.model;

import com.sports.entity.Coach;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamsDto {
	
	private int id;
	private String sport_name;
	private String team_name;
	private String city;
	private String country;
	private Coach coach;

}
