package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/language")
public class LanguageController {
    private LanguageService languageService;

     @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }


    @PostMapping("/add")
    public Result add(@RequestBody Language language) {
        return this.languageService.add(language);

    }
}