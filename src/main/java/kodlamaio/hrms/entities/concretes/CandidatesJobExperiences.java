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
@Table(name = "candidates_job_experiences")
public class CandidatesJobExperiences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidates_job_experience_id")
    private int candidatesJobExperienceId;

    @Column(name= "job_experience_company_name",nullable = true)
    private String experienceCompanyName;

    @Column(name = "job_experience_starting_date",nullable = true)
    private LocalDate experienceStartingDate;

    @Column(name = "job_experience_end_date",nullable = true)
    private LocalDate experienceEndDate;

    @Column(name ="job_experience_position",nullable = true)
    private String experiencePosition;

    @OneToMany(mappedBy = "candidatesJobExperiences")
    private List<Cv> cv;












}
