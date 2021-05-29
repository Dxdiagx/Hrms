package kodlamaio.hrms.business.abstracts;
import kodlamaio.hrms.core.utilities.results.DataResult;
import org.apache.catalina.User;

import java.util.List;

public interface UsersService {
    DataResult<List<User>> getAll();
}
