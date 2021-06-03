package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CvService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvDao;
import kodlamaio.hrms.entities.concretes.Cv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CvManager implements CvService {
    private CvDao cvDao;

    @Autowired
    public CvManager(CvDao cvDao) {

        this.cvDao = cvDao;
    }


    @Override
    public DataResult<List<Cv>> getAll() {
        return new SuccessDataResult<>(this.cvDao.findAll());
    }

    @Override
    public Result add(Cv cv) {
        return new SuccessDataResult<>(this.cvDao.save(cv));
    }

    @Override
    public DataResult<List<Cv>> getAllSortedWorkExperience() {
        Sort sort = Sort.by(Sort.Direction.DESC, "candidatesJobExperiences.experienceEndDate");
        return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(sort));

    }

    @Override
    public DataResult<List<Cv>> getAllSortedSchoolExperience() {
        Sort sort = Sort.by(Sort.Direction.DESC, "schools.schoolEndDate");
        return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(sort));


    }

}
