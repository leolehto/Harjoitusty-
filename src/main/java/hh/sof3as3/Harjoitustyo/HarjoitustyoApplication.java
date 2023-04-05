package hh.sof3as3.Harjoitustyo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.sof3as3.Harjoitustyo.domain.Division;
import hh.sof3as3.Harjoitustyo.domain.DivisionRepository;
import hh.sof3as3.Harjoitustyo.domain.Team;
import hh.sof3as3.Harjoitustyo.domain.TeamRepository;

@SpringBootApplication
public class HarjoitustyoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarjoitustyoApplication.class, args);
	}
	@Bean
	public CommandLineRunner teamDemo(TeamRepository teamRepository, DivisionRepository dRepository) {
		return (args) -> {
		Division division1 = new Division("AFC East");
		Division division2 = new Division("AFC North");
		Division division3 = new Division("AFC South");
		Division division4 = new Division("AFC West");
		Division division5 = new Division("NFC East");
		Division division6 = new Division("NFC North");
		Division division7 = new Division("NFC South");
		Division division8 = new Division("NFC West");
		dRepository.save(division1);
		dRepository.save(division2);
		dRepository.save(division3);
		dRepository.save(division4);
		dRepository.save(division5);
		dRepository.save(division6);
		dRepository.save(division7);
		dRepository.save(division8);
		Team team1 = new Team("Cincinati Bengals", "Joe Burrow", division2);
		Team team2 = new Team("Buffalo Bills", "Josh Allen", division1);
		teamRepository.save(team1);
		teamRepository.save(team2);
		};

	}
}
