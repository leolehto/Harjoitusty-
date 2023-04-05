package hh.sof3as3.Harjoitustyo.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DivisionRepository extends CrudRepository<Division, Long> {
	List<Division> findByName(String name);
}
