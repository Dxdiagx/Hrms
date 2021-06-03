package kodlamaio.hrms.Adapters.abstracts;
import kodlamaio.hrms.entities.concretes.Users;


public interface LogCheckService1 {
    default boolean logCheck() {
        return true;
    }

    default boolean emailValid(String email) {
        return true;
    }
    default boolean employeesActivation(Users users){
        return true;
    }
}
