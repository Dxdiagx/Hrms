package kodlamaio.hrms.Adapters.concretes;
import kodlamaio.hrms.Adapters.abstracts.LogCheckService1;
import kodlamaio.hrms.mernis.RLRKPSPublicSoap;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MernisManager implements LogCheckService1 {


    @Override
    public boolean logCheck(String id, String firstName, String lastName,LocalDate birthDate) {

        RLRKPSPublicSoap kknkpsPublicSoap=new RLRKPSPublicSoap();
        boolean result=false;
        try {
            result=kknkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(id),firstName,lastName,birthDate.getYear());
        }
        catch (Exception e){
            e.printStackTrace();
        }
   return result;
    }

}
