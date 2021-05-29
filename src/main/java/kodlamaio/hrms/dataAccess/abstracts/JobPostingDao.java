package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobPostings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface JobPostingDao extends JpaRepository<JobPostings,Integer> {
    List<JobPostings> getByisActivateTrue();
    List<JobPostings> getByisActivateTrueAndEmployer_CompanyName(String companyName);
    List<JobPostings> getByisActivateTrueOrderByCreatedDate();
}
