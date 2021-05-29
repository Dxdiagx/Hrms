package kodlamaio.hrms.business.abstracts;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Employees;
import java.util.List;

public interface EmployeesService {
    DataResult<List<Employees>> getAll();
}
