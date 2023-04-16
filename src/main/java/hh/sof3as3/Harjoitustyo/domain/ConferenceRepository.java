package hh.sof3as3.Harjoitustyo.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ConferenceRepository extends CrudRepository <Conference, Long> {
	List<Conference>  findByName(String name);
	

}
