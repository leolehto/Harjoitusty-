package hh.sof3as3.Harjoitustyo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import hh.sof3as3.Harjoitustyo.domain.Conference;
import hh.sof3as3.Harjoitustyo.domain.ConferenceRepository;
import hh.sof3as3.Harjoitustyo.domain.Division;
import hh.sof3as3.Harjoitustyo.domain.DivisionRepository;
import hh.sof3as3.Harjoitustyo.domain.Team;
import hh.sof3as3.Harjoitustyo.domain.TeamRepository;

@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class TeamRepositoryTest {
@Autowired
TeamRepository teamRepository;
@Autowired
DivisionRepository dRepository;
@Autowired
ConferenceRepository cRepository;
@Test
public void createNewTeam() {
	Team team = new Team("Arizona Cardinals", "Kyler Murray", new Division("west"), new Conference("NFC"));
	teamRepository.save(team);
	assertThat(team.getId()).isNotNull();
}
@Test
public void DeleteById() {
	teamRepository.deleteById((long) 2);
}
@Test
public void findByNameShouldReturnQb() {
	List<Team>teams = teamRepository.findByName("Miami Dolphins");
	assertThat(teams.get(0).getQb()).isEqualTo("Tua Tagovailoa");
}
}
