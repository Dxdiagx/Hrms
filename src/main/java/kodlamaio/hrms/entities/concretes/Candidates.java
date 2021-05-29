package kodlamaio.hrms.entities.concretes;
//adaylar
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name  = "candidates")
@AllArgsConstructor
@NoArgsConstructor
public class Candidates extends Users{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "national_identity")
    private String nationalId;

    @Column(name  = "birthdate")
    private LocalDate birthDate;


}
