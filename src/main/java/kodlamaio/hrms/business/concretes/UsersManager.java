package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.UsersService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.UsersDao;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersManager implements UsersService {
    private UsersDao usersDao;

    @Autowired
    public UsersManager(UsersDao usersDao) {
        this.usersDao = usersDao;
    }


    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult(this.usersDao.findAll());
    }
}
