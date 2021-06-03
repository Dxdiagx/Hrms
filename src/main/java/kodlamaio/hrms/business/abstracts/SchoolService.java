package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Schools;

public interface SchoolService {

    Result add(Schools schools);
}
