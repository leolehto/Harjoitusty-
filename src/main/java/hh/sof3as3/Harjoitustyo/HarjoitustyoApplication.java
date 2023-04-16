package hh.sof3as3.Harjoitustyo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import hh.sof3as3.Harjoitustyo.domain.Conference;
import hh.sof3as3.Harjoitustyo.domain.ConferenceRepository;
import hh.sof3as3.Harjoitustyo.domain.Division;
import hh.sof3as3.Harjoitustyo.domain.DivisionRepository;
import hh.sof3as3.Harjoitustyo.domain.Team;
import hh.sof3as3.Harjoitustyo.domain.TeamRepository;
import hh.sof3as3.Harjoitustyo.domain.User;
import hh.sof3as3.Harjoitustyo.domain.UserRepository;

@SpringBootApplication
public class HarjoitustyoApplication {
	private static final Logger log = LoggerFactory.getLogger(HarjoitustyoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(HarjoitustyoApplication.class, args);
	}
	@Bean
	public CommandLineRunner teamDemo(TeamRepository teamRepository, DivisionRepository dRepository, ConferenceRepository cRepository, UserRepository userRepository) {
		return (args) -> {
			log.info("save a couple of teams");
	
		Conference conference1 = new Conference("AFC");
		Conference conference2 = new Conference("NFC");
		cRepository.save(conference1);			
		cRepository.save(conference2);
		Division division1 = new Division("East");
		Division division2 = new Division("North");
		Division division3 = new Division("South");
		Division division4 = new Division("West");
		dRepository.save(division1);
		dRepository.save(division2);
		dRepository.save(division3);
		dRepository.save(division4);	
		Team team1 = new Team("Miami Dolphins", "Tua Tagovailoa", division1, conference1);
		Team team2 = new Team("Buffalo Bills", "Josh Allen", division1, conference1);
		Team team3 = new Team("New England Patriots", "Mac Jones", division1, conference1);
		Team team4 = new Team("New York Jets", "Zach Wilson", division1, conference1);	
		Team team5 = new Team("Cincinnati Bengals", "Joe Burrow", division2, conference1);
		Team team6 = new Team("Baltimore Ravens", "Lamar Jackson", division2, conference1);
		Team team7 = new Team("Pittsburgh Steelers", "Kenny Pickett", division2, conference1);
		Team team8 = new Team("Celeveland Browns", "Deshaun Watson", division2, conference1);
		Team team9 = new Team("Jacksonville Jaguars", "Trevor Lawrence", division3, conference1);
		Team team10 = new Team("Tennesee Titans", "Ryan Tannehill", division3, conference1);
		Team team11 = new Team("indianapolis Colts", "TBD", division3, conference1);
		Team team12 = new Team("Houston Texas", "TBD", division3, conference1);
		Team team13 = new Team("Kansas City Chiefs", "Patrick Mahomes", division4, conference1);
		Team team14 = new Team("Los Angeles Chargers", "Justin Herbert", division4, conference1);
		Team team15 = new Team("Las Vegas Raiders", "Jimmy Garoppolo", division4, conference1);
		Team team16 = new Team("Denver Broncos", "Russel Willson", division4, conference1);
		Team team17 = new Team("Philadelphia Eagles", "Jalen Hurts", division1, conference2);
		Team team18 = new Team("Dallas Cowboys", "Dak prescot", division1, conference2);
		Team team19 = new Team("New York Giants", "Ryan Jones", division1, conference2);
		Team team20 = new Team("Washington Commanders", "Jacoby Brisset", division1, conference2);
		Team team21 = new Team("Minnesota Vikings", "Kirk Cousins", division2, conference2);
		Team team22 = new Team("Detroit Lions", "Jared Goff", division2, conference2);
		Team team23 = new Team("Green Bay Packers", "Jordan Love", division2, conference2);
		Team team24 = new Team("Chicago Bears", "Justin Fields", division2, conference2);
		Team team25 = new Team("Tampa Bay Buccaneers", "Baker Mayfield", division3, conference2);
		Team team26 = new Team("Carolina Panthers", "TBD", division3, conference2);
		Team team27 = new Team("New Orleans Saints", "Dereck Carr", division3, conference2);
		Team team28 = new Team("Atlanta Falcons", "Desmond Ridder", division3, conference2);
		Team team29 = new Team("San Francisco 49ers", "Brock Purdy", division4, conference2);
		Team team30 = new Team("Seattle Seahawks", "Geno Smith", division4, conference2);
		Team team31 = new Team("Los Angeles Rams", "Matthew Stafford", division4, conference2);
		Team team32 = new Team("Arizona Cardinals", "Kyler Murray", division4, conference1);
		teamRepository.save(team1);
		teamRepository.save(team2);
		teamRepository.save(team3);
		teamRepository.save(team5);
		teamRepository.save(team6);
		teamRepository.save(team7);
		teamRepository.save(team8);
		teamRepository.save(team9);
		teamRepository.save(team10);
		teamRepository.save(team11);
		teamRepository.save(team12);
		teamRepository.save(team13);
		teamRepository.save(team14);
		teamRepository.save(team15);
		teamRepository.save(team16);
		teamRepository.save(team17);
		teamRepository.save(team18);
		teamRepository.save(team19);
		teamRepository.save(team20);
		teamRepository.save(team21);
		teamRepository.save(team22);
		teamRepository.save(team23);
		teamRepository.save(team24);
		teamRepository.save(team25);
		teamRepository.save(team26);
		teamRepository.save(team27);
		teamRepository.save(team28);
		teamRepository.save(team29);
		teamRepository.save(team30);
		teamRepository.save(team31);
		teamRepository.save(team32);
		
		
		User user1 = new User("user", "$2a$10$y0dJaeU08seg5bQ5NpRZxesbMDtXu4cSLznW3UzkObjsEjoTc4kTa", "USER");
		User user2 = new User("admin", "$2a$10$Mbyyk/79TqiuugWfMZbaze3.nFgpSPPHaGCRALl65KTuWxrEa0RD6", "ADMIN");
		userRepository.save(user1);
		userRepository.save(user2);
		
		log.info("fetch all teams");
		for (Team team : teamRepository.findAll()) {
			log.info(team.toString());
		}
		};

	}
}
