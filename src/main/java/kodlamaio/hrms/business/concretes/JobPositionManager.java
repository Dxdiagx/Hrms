package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao job_PositionDao) {

        this.jobPositionDao = job_PositionDao;
    }


    @Override
    public DataResult<List<JobPositions>> getAll() {
        return new SuccessDataResult<>(this.jobPositionDao.findAll());
    }

    @Override
    public Result add(JobPositions jobPositions) {

        if(jobPositionDao.findAllByPosition(jobPositions.getPosition()).stream().count()!=0){
            return new ErrorResult("İş pozisyonu mevcut !");
        }
        else {
            jobPositionDao.save(jobPositions);
        }
        return new SuccessResult("Kayıt Başarılı");
    }
}
