package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_postings")
public class JobPostings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_postings_id")
    private int id;

    @Column(name = "job_details")
    private String jobDetails;

    @Column(name = "min_wage")
    private double minWage;

    @Column(name = "max_wage")
    private double maxWage;

    @Column(name = "number_of_open_position")
    private int numberOfOpenPosition;

    @Column(name = "create_date")
    public LocalDate createdDate;

    @Column(name = "last_apply_date")
    private LocalDate lastApplyDate;

    @Column(name ="is_activate")
    private boolean isActivate;

    @ManyToOne()
    @JoinColumn(name ="job_position_id")
    private JobPositions jobPosition;

    @ManyToOne()
    @JoinColumn(name = "employers_id")
    private Employers employer;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private Cities cities;


}
