package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.Adapters.abstracts.LogCheckService1;
import kodlamaio.hrms.business.abstracts.CandidatesService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.CandidatesDao;
import kodlamaio.hrms.entities.concretes.Candidates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidatesManager implements CandidatesService {
    private CandidatesDao candidatesDao;
    private LogCheckService1 logCheckService1;

    @Autowired
    public CandidatesManager(CandidatesDao candidatesDao, LogCheckService1 logCheckService1) {
        this.candidatesDao = candidatesDao;
        this.logCheckService1 = logCheckService1;
    }


    @Override
    public DataResult<List<Candidates>> getAll() {
        return new SuccessDataResult<>(this.candidatesDao.findAll(),"Eklendi");

    }

    @Override
    public Result add(Candidates candidates) {


         if (candidatesDao.findAllByNationalIdAndEmail(candidates.getNationalId(),
                 candidates.getEmail()).stream().count()!=0){
             return new ErrorResult("Girdiğiniz Bilgiler Sistemde Kayıtlı !");
         }

      else if((candidates.getNationalId()==null) || (candidates.getBirthDate()==null)
                 || (candidates.getFirstName()==null) ||
                 (candidates.getLastName()==null) ||
                 (candidates.getEmail()==null) || (candidates.getPassword()==null) ){
          return new ErrorResult("Alanlar boş bırakılmaz.");
         }
        else if (logCheckService1.logCheck()==false){
            return new ErrorResult("Mernis Doğrulaması Gerçekleştirilemedi.");
         }
        else if (logCheckService1.emailValid(candidates.getEmail())==false){

            return new ErrorResult("Doğrulama başarısız...");
        }
        candidatesDao.save(candidates);
    return new SuccessResult("Kayıt başarılı...");
    }
}
