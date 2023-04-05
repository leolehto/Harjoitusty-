package hh.sof3as3.Harjoitustyo.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
	List<Team> findByName(String string);

}
