package kodlamaio.hrms.Adapters.abstracts;
import kodlamaio.hrms.entities.concretes.Users;

import java.time.LocalDate;


public interface LogCheckService1 {
    boolean logCheck(String id, String firstName, String lastName, LocalDate birthDate);

    default boolean emailValid(String email) {
        return true;
    }
    default boolean employeesActivation(Users users){
        return true;
    }
}
