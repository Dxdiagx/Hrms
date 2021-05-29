package kodlamaio.hrms.dataAccess.abstracts;
import kodlamaio.hrms.entities.concretes.Candidates;
import kodlamaio.hrms.entities.concretes.Employers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployersDao  extends JpaRepository<Employers,Integer> {
    List<Employers> findAllByEmail(String email);
}
