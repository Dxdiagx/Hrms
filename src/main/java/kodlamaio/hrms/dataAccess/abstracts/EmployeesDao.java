package kodlamaio.hrms.dataAccess.abstracts;
import kodlamaio.hrms.entities.concretes.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesDao  extends JpaRepository<Employees,Integer> {
}
