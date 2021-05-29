package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployeesService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.entities.concretes.Employees;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeesManager implements EmployeesService {
    @Override
    public DataResult<List<Employees>> getAll() {
        return new SuccessDataResult<>("Data Listelendi...");
    }
}
