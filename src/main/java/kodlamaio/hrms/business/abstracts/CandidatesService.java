package kodlamaio.hrms.business.abstracts;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidates;
import java.util.List;

public interface CandidatesService {
    DataResult<List<Candidates>> getAll();
    Result add(Candidates candidates);
}
