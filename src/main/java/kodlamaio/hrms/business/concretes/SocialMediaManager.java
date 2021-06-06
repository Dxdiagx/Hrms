package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SocialMediaService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SocialMediaDao;
import kodlamaio.hrms.entities.concretes.SocialMedia;
import org.springframework.stereotype.Service;

@Service
public class SocialMediaManager implements SocialMediaService{
private SocialMediaDao socialMediaDao;

    public SocialMediaManager(SocialMediaDao socialMediaDao) {
        this.socialMediaDao = socialMediaDao;
    }

    @Override
    public Result add(SocialMedia socialMedia) {
        this.socialMediaDao.save(socialMedia);
        return new SuccessResult("Sosyal Medya Hesabınız eklendi ");
    }
}
