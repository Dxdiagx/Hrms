package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidates;
import kodlamaio.hrms.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/job_position")

public class JobPositionController {

    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionController(JobPositionService jobPositionService) {

        this.jobPositionService = jobPositionService;
    }
    @GetMapping("/getall")
    public DataResult<List<JobPositions>> getAll(){
        return this.jobPositionService.getAll();
    }

    @PostMapping("/save")
    public Result add(@RequestBody JobPositions jobPositions){
        return this.jobPositionService.add(jobPositions);
    }

}
