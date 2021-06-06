package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.Adapters.cloudinary.CloudinaryService;
import kodlamaio.hrms.business.abstracts.CvService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.CvDao;
import kodlamaio.hrms.entities.concretes.Cv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@Service
public class CvManager implements CvService {
    private CvDao cvDao;
    private CloudinaryService cloudinaryService;

    @Autowired
    public CvManager(CvDao cvDao, CloudinaryService cloudinaryService) {

        this.cvDao = cvDao;
        this.cloudinaryService = cloudinaryService;
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
    @Override
    public Result uploadImage(MultipartFile multipartFile, int cvId) {
        try{
            String filePath=this.cloudinaryService.upload(multipartFile).getData().get("url").toString();
            Cv cv=cvDao.getOne(cvId);
            cv.setImage(filePath);
            cvDao.save(cv);
            return new SuccessResult("Yüklendi");

        }catch (IOException e){
            return new ErrorResult("Yüklenirken Bir Hata Oluştu");
        }
    }
}
