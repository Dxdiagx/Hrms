package kodlamaio.hrms.Adapters.concretes;
import kodlamaio.hrms.Adapters.abstracts.LogCheckService1;
import kodlamaio.hrms.FakeMernis.FakeMernis;
import org.springframework.stereotype.Service;

@Service
public class MernisManager implements LogCheckService1 {

    public boolean logCheck() {
        FakeMernis mernis = new FakeMernis();
        return mernis.logCheck();

    }
}