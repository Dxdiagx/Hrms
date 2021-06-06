package kodlamaio.hrms.entities.concretes;
//adaylar
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "cv"})
@Table(name  = "candidates")
@AllArgsConstructor
@NoArgsConstructor
public class Candidates extends Users {

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

    @Column(name = "birthdate")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "candidates")
    private List<Cv> cv;


}