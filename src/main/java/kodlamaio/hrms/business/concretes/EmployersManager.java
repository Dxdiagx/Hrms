package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.Adapters.abstracts.EmailValidatorService;
import kodlamaio.hrms.Adapters.abstracts.LogCheckService1;
import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.EmployersDao;
import kodlamaio.hrms.entities.concretes.Employers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployersManager implements EmployersService {
    private LogCheckService1 logCheckService1;
    private EmailValidatorService emailValidatorService;

   private EmployersDao employersDao;

    @Autowired
   public EmployersManager(LogCheckService1 logCheckService1, EmailValidatorService emailValidatorService, EmployersDao employersDao) {
        this.logCheckService1 = logCheckService1;
        this.emailValidatorService = emailValidatorService;
        this.employersDao = employersDao;
    }


    @Override
    public DataResult<List<Employers>> getAll() {
        return new SuccessDataResult<>(this.employersDao.findAll(),"Data listelendi.");

    }

    @Override
    public Result add(Employers employers) {

              if (employers.getCompanyName()==null ||
                      employers.getPhoneNumber()==null || employers.getWebAddress()==null
                      || employers.getEmail()==null || employers.getPassword()==null){
                  return new ErrorResult("Alanlar boş bırakılamaz !");
              }
        else if (employersDao.findAllByEmail(employers.getEmail()).stream().count()!=0){
            return new ErrorResult("Girdiğiniz Bilgiler Sistemde Kayıtlı !");
              }
        else if (employers.getWebAddress().contains(employers.getEmail())==false){

            return new ErrorResult("Girilen e-posta Şirket ile uyumsuz ! ");
              }
        else if (emailValidatorService.isEmailValid(employers.getEmail())==false || logCheckService1.employeesActivation(employers)==false){

            return new ErrorResult("Doğrulama başarısız...");
              }
        employersDao.save(employers);
        return new SuccessResult("Kayıt başarılı...");
    }
}
