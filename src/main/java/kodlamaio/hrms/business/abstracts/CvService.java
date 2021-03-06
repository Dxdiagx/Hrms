package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Cv;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CvService {
    DataResult<List<Cv>> getAll();
    Result add(Cv cv);

    DataResult<List<Cv>> getAllSortedWorkExperience();
    DataResult<List<Cv>> getAllSortedSchoolExperience();

    Result uploadImage(MultipartFile multipartFile, int cvId);



}
