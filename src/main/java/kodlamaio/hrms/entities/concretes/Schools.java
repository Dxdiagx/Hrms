package kodlamaio.hrms.entities.concretes;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "schools")
public class Schools {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int schoolId;

    @Column(name ="school_name")
    private String schoolName;
    @Column(name ="school_department_name")
    private String schoolDepartmentName;

    @Column(name ="school_start_date")
    private LocalDate schoolStartDate;

    @Column(name ="school_end_date",nullable = true)
    private LocalDate schoolEndDate;

    @Column(name="candidates_id")
    private int candidatesId;

    @OneToMany(mappedBy = "schools")
    private List<Cv> cv;


}
