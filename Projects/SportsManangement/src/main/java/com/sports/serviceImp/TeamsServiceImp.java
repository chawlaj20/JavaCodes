package com.sports.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports.entity.Coach;
import com.sports.entity.Teams;
import com.sports.exception.CoachNotFoundException;
import com.sports.exception.TeamNotFoundException;
import com.sports.model.TeamsDto;
import com.sports.repository.CoachRepository;
import com.sports.repository.TeamsRepository;
import com.sports.service.TeamsService;
import com.sports.util.TeamsConvertor;

@Service
public  class TeamsServiceImp implements TeamsService{
	
	@Autowired
	private TeamsRepository teamsRepository;
	@Autowired
	private TeamsConvertor teamsConvertor;
	@Autowired
	private CoachRepository coachRepository;

	
	@Override
	public String createTeam(Teams teams) {   //method for creating Team
		String message = null;
		teamsRepository.save(teams);  //saving bank to database
		if(teams!=null) {
			message = "New Team is formed";
		}
		return message;
	} //end of method


	@Override
	public TeamsDto updateTeam(int id, Teams teams) {
		// TODO Auto-generated method stub
		Teams getTeams = teamsRepository.findById(id).get();
		getTeams.setTeam_name(teams.getTeam_name());
		getTeams.setSport_name(teams.getSport_name());
		getTeams.setCity(teams.getCity());
		getTeams.setCountry(teams.getCountry());
		
		teamsRepository.save(getTeams);
		return teamsConvertor.convertTeamsEntityToTeamsDto(getTeams);
	}


	@Override
	public TeamsDto getTeamById(int id) {
		//method for getting Team by id
				Teams teams = teamsRepository.findById(id).get();		
				return teamsConvertor.convertTeamsEntityToTeamsDto(teams);
		
	}


	@Override
	public List<TeamsDto> getAllTeams() {
		//method for getting all id
				List<Teams> teams = teamsRepository.findAll();
				List<TeamsDto> teamsDto = new ArrayList<>();
				for(Teams a: teams) {
					teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
				}
				return teamsDto;
	}


	@Override
	public String deleteTeamById(int id) {
		//method for deleting team by id
				String message=null;
				Optional<Teams> teams=teamsRepository.findById(id);
				if(teams.isPresent()) {		
					teamsRepository.deleteById(id);
					message = "Team Deleted Successfully.....";
				}
				else {
					message = "Team Details are not found... ==> "+id+"\n ----Enter Correct Team Id !";
				}
				return message;
	}


	@Override
	public void deleteAllTeams() {
		//method for deleting all teams
				teamsRepository.deleteAll();
		
	}


	@Override
	public TeamsDto assignCoachToTeam(int id, int coachId) {
		//method for assigning coach to team
				Teams teams = teamsRepository.findById(id).orElseThrow(()-> new TeamNotFoundException("Team","ID",id));
				Coach coach = coachRepository.findById(coachId).orElseThrow(()-> new CoachNotFoundException("Coach","ID",id));
				teams.setCoach(coach);
				teamsRepository.save(teams);
				return teamsConvertor.convertTeamsEntityToTeamsDto(teams);
	}


	@Override
	public List<TeamsDto> getTeamsByTeam_name(String team_name) {
		List<Teams> teams = teamsRepository.getTeamByTeam_name(team_name);
		List<TeamsDto> teamsDto = new ArrayList<>();
		for(Teams a: teams) {
			teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
		}
		return teamsDto;
	}


	@Override
	public List<TeamsDto> getTeamsBySport_name(String sport_name) {
		List<Teams> teams= teamsRepository.getTeamsBySport_name(sport_name);
		List<TeamsDto> teamsDto = new ArrayList<>();
		for(Teams a: teams) {
			teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
		}
		return teamsDto;
	}
		
	@Override
	public List<TeamsDto> getTeamsByCity(String city) {
		List<Teams> teams = teamsRepository.getTeamsByCity(city);
		List<TeamsDto> teamsDto = new ArrayList<>();
		for(Teams a: teams) {
			teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
		}
		return teamsDto;
	
	}
	@Override
	public List<TeamsDto> getTeamsByCoach(int coachId) {
		List<Teams>teams= teamsRepository.getTeamsByCoach(coachId);
		List<TeamsDto> teamsDto = new ArrayList<>();
		for(Teams a : teams) {
			teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
		}
		return teamsDto;
	}


	

	
}