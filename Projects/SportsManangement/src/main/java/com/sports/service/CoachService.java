package com.sports.service;

import java.util.List;

import com.sports.entity.Coach;
import com.sports.model.CoachDto;




public interface CoachService {

	String createCoach(Coach coach);
	CoachDto updateCoach(int id,Coach coach);
	CoachDto getCoachById(int id);	
	List<CoachDto> getAllCoaches();
	String deleteCoachById(int id);
	void deleteAllCoaches();
	List<CoachDto> getCoachByCoach_name(String coach_name);
	List<CoachDto> getCoachByPhone_no(long phone_no);
	List<CoachDto>getCoachByCity(String city);
	
}
