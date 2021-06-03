package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv")
public class Cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cv_id")
    private int CvId;

    @Column(name="candidates_cover_letter")
    private String coverLetter;

    @ManyToOne()
    @JoinColumn(name ="candidates_job_experience_id")
    private CandidatesJobExperiences candidatesJobExperiences;

    @ManyToOne()
    @JoinColumn(name ="candidates_id")
    private Candidates candidates;


}
