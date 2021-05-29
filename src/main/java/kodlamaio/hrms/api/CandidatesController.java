package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.CandidatesService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/candidates")
public class CandidatesController {

    private CandidatesService candidatesService;

    @Autowired
    public CandidatesController(CandidatesService candidatesService) {
        this.candidatesService = candidatesService;
    }

    @GetMapping("/getall")
    public DataResult<List<Candidates>> getAll(){
        return this.candidatesService.getAll();
    }

    @PostMapping("/save")
    public Result add(@RequestBody Candidates candidates){
        return this.candidatesService.add(candidates);
    }
}
