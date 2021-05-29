package kodlamaio.hrms.dataAccess.abstracts;
import kodlamaio.hrms.entities.concretes.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidatesDao extends JpaRepository<Candidates,Integer> {
    List<Candidates> findAllByNationalIdAndEmail(String nationaltyiD,String email);

}
