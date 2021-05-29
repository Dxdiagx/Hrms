package kodlamaio.hrms.dataAccess.abstracts;
import kodlamaio.hrms.entities.concretes.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<Users,Integer> {
}
