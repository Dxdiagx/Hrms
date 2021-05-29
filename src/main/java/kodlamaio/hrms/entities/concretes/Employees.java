package kodlamaio.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employees")
//Calışanlar
@AllArgsConstructor
@NoArgsConstructor
public class Employees {
    @Id
    @GeneratedValue
    @Column(name ="id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


}
