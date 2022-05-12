package co.edu.uniajc.demo.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_id")
    private long id;

    @Column(name = "st_name")
    private String name;

    @Column(name = "st_last_name")
    private String lastName;

    @Column(name = "st_age")
    private Integer age;

    @Column(name = "st_state")
    private Boolean state;

}
