package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

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

    @Column(name="image")
    private  String image;

    @ManyToOne()
    @JoinColumn(name ="candidates_id")
    private Candidates candidates;

    @ManyToOne()
    @JoinColumn(name ="candidates_job_experience_id")
    private CandidatesJobExperiences candidatesJobExperiences;

    @ManyToOne()
    @JoinColumn(name ="school_id")
    private Schools schools;

    @ManyToOne()
    @JoinColumn(name ="technologies_id")
    private Technologies technologies;

    @ManyToOne()
    @JoinColumn(name ="social_media_id")
    private SocialMedia socialMedia;

    @ManyToOne()
    @JoinColumn(name ="language_id")
    private Language language;

}
