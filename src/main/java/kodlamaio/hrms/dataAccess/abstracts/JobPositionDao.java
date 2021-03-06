package kodlamaio.hrms.dataAccess.abstracts;
import kodlamaio.hrms.entities.concretes.JobPositions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobPositionDao extends JpaRepository<JobPositions,Integer> {

    List<JobPositions> findAllByPosition(String position);

}
