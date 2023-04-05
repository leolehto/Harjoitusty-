package hh.sof3as3.Harjoitustyo.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String qb;
	
	@ManyToOne
	@JoinColumn(name = "divisionid")
	private Division division;
	
	public Team() {

	}
	
	public Team(String name, String qb, Division division) {
		super();
		this.name = name;
		this.qb = qb;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQb(String qb) {
		this.qb = qb;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getQb() {
		return qb;
	}
	
	

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", qb=" + qb + "]";
	}
	
	
}
