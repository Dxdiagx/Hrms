package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.CvService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Cv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@RestController
@RequestMapping("api/Cv")
public class CvController {
    private CvService cvService;

    @Autowired
    public CvController(CvService cvService) {
        this.cvService = cvService;
    }


    @GetMapping("/getAll")
    public DataResult<List<Cv>> getAll() {
        return this.cvService.getAll();
    }


    @PostMapping(name = "/saveCv")
    public Result add(@RequestBody Cv cv) {
        return this.cvService.add(cv);
    }


    @GetMapping("/getAllSortedWorkExperience")
    public DataResult<List<Cv>> getAllSortedWorkExperience() {
        return this.cvService.getAllSortedWorkExperience();
    }


    @GetMapping("/getAllSortedSchoolExperience")
    public DataResult<List<Cv>> getAllSortedSchoolExperience() {
        return this.cvService.getAllSortedSchoolExperience();
    }

    @PostMapping("/uploadimage")
    public Result uploadImage(@RequestBody MultipartFile file, @RequestParam int cvId){
        return this.cvService.uploadImage(file, cvId);
    }

}
