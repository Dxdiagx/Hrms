package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPostingDao;
import kodlamaio.hrms.entities.concretes.JobPostings;
import kodlamaio.hrms.business.abstracts.JobPostingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostingsManager implements JobPostingsService {
    private JobPostingDao jobPostingDao;

    @Autowired
    public JobPostingsManager(JobPostingDao jobPostingDao) {
        this.jobPostingDao = jobPostingDao;
    }


    @Override
    public Result add(JobPostings jobPostings) {
        this.jobPostingDao.save(jobPostings);
        return new SuccessResult("İş ilanı Eklendi");
    }

    @Override
    public DataResult<List<JobPostings>> getByisActivateTrue() {
        return new SuccessDataResult<>(this.jobPostingDao.getByisActivateTrue(),"Tüm Aktif İş İlanları Listelenmiştir");
    }

    @Override
    public DataResult<List<JobPostings>> getByisActivateTrueAndEmployer_CompanyName(String companyName) {
        return new SuccessDataResult<>(this.jobPostingDao.getByisActivateTrueAndEmployer_CompanyName(companyName),"Şirkete Göre Listeleme Yapılmıştır");
    }

    @Override
    public DataResult<List<JobPostings>> getByisActivateTrueOrderByCreatedDate() {
        return new SuccessDataResult<>(this.jobPostingDao.getByisActivateTrueOrderByCreatedDate(),"Sıralandı");
    }

    @Override
    public Result contrastPost(int id) {
        JobPostings jobPostings=this.jobPostingDao.findById(id).get();
        jobPostings.setActivate(!jobPostings.isActivate());
        this.jobPostingDao.save(jobPostings);
        return new SuccessResult("Aktif İş İlanı Pasif Hale Gelmiştir");
    }


}
