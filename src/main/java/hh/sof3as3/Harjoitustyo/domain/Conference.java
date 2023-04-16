package hh.sof3as3.Harjoitustyo.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Conference {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long conferenceid;
	private String name;
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "conference")
	private List<Team> teams;

	public Conference() {
		
	}
	
	public Conference(String name) {
		super();
		this.name = name;
	}

	public long getConferenceid() {
		return conferenceid;
	}

	public void setConferenceid(long conferenceid) {
		this.conferenceid = conferenceid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	@Override
	public String toString() {
		return "Conference [conferenceid=" + conferenceid + ", name=" + name + ", teams=" + teams + "]";
	}

	
	
}
