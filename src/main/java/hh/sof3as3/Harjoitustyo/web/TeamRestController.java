package hh.sof3as3.Harjoitustyo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hh.sof3as3.Harjoitustyo.domain.Team;
import hh.sof3as3.Harjoitustyo.domain.TeamRepository;

@RestController
public class TeamRestController {
	
	@Autowired
	private TeamRepository teamRepository;
	
	@GetMapping(value = "/teams")
	public @ResponseBody List<Team>teams(){
		return (List<Team>) teamRepository.findAll();
		
	}
	
}
