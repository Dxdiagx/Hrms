package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "cv"})
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "languages")
public class Languages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int languageId;

    @Column(name = "language_name",nullable = true)
    private String languageName;

    @Column(name = "language_level",nullable = true)
    private int languageLevel;


    @Column(name="candidates_id")
    private int candidatesId;
}
