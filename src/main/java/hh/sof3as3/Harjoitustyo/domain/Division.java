package hh.sof3as3.Harjoitustyo.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Division {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long divisionid;
	private String name;
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "division")
	private List<Team> teams;
	
	
	
	public Division() {
	
}
	public Division(String name) {
		super();
		this.name = name;
	}
	public void setDivisionid(long divisionid) {
		this.divisionid = divisionid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	public long getDivisionid() {
		return divisionid;
	}
	public String getName() {
		return name;
	}
	public List<Team> getTeams() {
		return teams;
	}
	@Override
	public String toString() {
		return "Division [divisionid=" + divisionid + ", name=" + name + ", teams=" + teams + "]";
	}
	
	
}	
