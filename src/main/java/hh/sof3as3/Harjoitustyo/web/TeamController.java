package hh.sof3as3.Harjoitustyo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.sof3as3.Harjoitustyo.domain.DivisionRepository;
import hh.sof3as3.Harjoitustyo.domain.Team;
import hh.sof3as3.Harjoitustyo.domain.TeamRepository;

@Controller
public class TeamController {
	@Autowired
	private TeamRepository teamRepository;
	@Autowired
	private DivisionRepository dRepository;
	
	@RequestMapping(value="/teamlist")
	public String getTeams(Model model) {
		model.addAttribute("teams", teamRepository.findAll());
		return "Teamlist";
		
	}
	
	@RequestMapping(value="/add")
	public String addTeam(Model model) {
		model.addAttribute("teams", new Team());
		model.addAttribute("divisions", dRepository.findAll());
		return "addTeam";
		
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String saveTeam(Team teams) {
		teamRepository.save(teams);
		return "redirect:teamlist";
		
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	public String deleteTeam(@PathVariable("id") Long teamId) {
		teamRepository.deleteById(teamId);
		return "redirect:../teamlist";
		
	}
	
	@RequestMapping(value="/edit/{id}")
	public String editTeam(@PathVariable("id") Long teamId, Model model) {
		model.addAttribute("team", teamRepository.findById(teamId));
		model.addAttribute("divisions", dRepository.findAll());
		return "editTeam";
		
	}
}
