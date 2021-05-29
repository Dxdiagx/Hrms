package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Cities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitiesDao extends JpaRepository<Cities,Integer> {

}
