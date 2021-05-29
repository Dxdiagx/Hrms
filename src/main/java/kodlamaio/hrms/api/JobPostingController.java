package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.JobPostingsService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPostings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/jobPostings")
public class JobPostingController {
    private JobPostingsService jobPostingsService;

    @Autowired
    public JobPostingController(JobPostingsService jobPostingsService) {
        this.jobPostingsService = jobPostingsService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPostings jobPostings) {
        return this.jobPostingsService.add(jobPostings);
    }

    @GetMapping("/getByisActivateTrue")
    public DataResult<List<JobPostings>> getByisActivateTrue(){
        return this.jobPostingsService.getByisActivateTrue();
    }

    @GetMapping("/getByisActivateTrueAndEmployer_CompanyName")
    public DataResult <List<JobPostings>> getByisActivateTrueAndEmployer_CompanyName(@RequestParam String companyName){
        return this.jobPostingsService.getByisActivateTrueAndEmployer_CompanyName(companyName);
    }

    @GetMapping("/getByisActivateTrueOrderByCreatedDate")
    public DataResult<List<JobPostings>> getByisActivateTrueOrderByCreatedDate(){
        return this.jobPostingsService.getByisActivateTrueOrderByCreatedDate();
    }

    @PostMapping("/contrastPost")
    public Result activePosting(@RequestParam int id) {
        return this.jobPostingsService.contrastPost(id);
    }

}
