package kodlamaio.hrms.Adapters.concretes;

import kodlamaio.hrms.Adapters.abstracts.LogCheckService1;

import java.time.LocalDate;

public class LogCheck1 implements LogCheckService1 {

    @Override
    public boolean logCheck(String id, String firstName, String lastName, LocalDate birthDate) {
        return false;
    }
}
