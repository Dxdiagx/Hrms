package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.TechnologiesService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Technologies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/technologies")
public class TechnologiesController {

    private TechnologiesService technologiesService;

    @Autowired
    public TechnologiesController(TechnologiesService technologiesService) {
        this.technologiesService = technologiesService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Technologies technologies) {
        return this.technologiesService.add(technologies);

    }
}
