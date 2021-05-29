package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name ="employers")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","jobPostings"})
//İs verenler
@AllArgsConstructor
@NoArgsConstructor
public class Employers extends Users{
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="company_name")
    private String companyName;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="web_address")
    private String webAddress;

    @OneToMany(mappedBy = "employer")
    private List<JobPostings> jobPostings;

}
