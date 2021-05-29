package kodlamaio.hrms.business.abstracts;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPostings;

import java.util.List;


public interface JobPostingsService {
    Result add(JobPostings jobPostings);
    DataResult<List<JobPostings>> getByisActivateTrue();
    DataResult <List<JobPostings>> getByisActivateTrueAndEmployer_CompanyName(String companyName);
    DataResult<List<JobPostings>> getByisActivateTrueOrderByCreatedDate();
   Result contrastPost(int id);


}
