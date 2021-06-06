package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "social_media")
public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int socialMediaId;

    @Column(name="github_address",nullable = true)
    private String githubAddress;

    @Column(name="linkedin_address",nullable = true)
    private String linkedinAddress;

    @Column(name="candidates_id")
    private int candidatesId;
    @OneToMany(mappedBy = "socialMedia")
    private List<Cv> cv;
}
