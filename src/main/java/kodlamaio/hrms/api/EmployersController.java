package kodlamaio.hrms.api;
import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/employers")
public class EmployersController {
    private EmployersService employersService;


    @Autowired
    public EmployersController(EmployersService employersService) {
        this.employersService = employersService;
    }
    @GetMapping("/getall")
    public DataResult<List<Employers>> getAll(){
        return this.employersService.getAll();
    }

    @PostMapping("/save")
    public Result add(@RequestBody Employers employers){
        return this.employersService.add(employers);
    }
}


