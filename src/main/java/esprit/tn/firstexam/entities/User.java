package esprit.tn.firstexam.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String pwd;
    private String firstName;
    private String lastNAme;

    private Role role;

    @ManyToMany
    private List<Project> developersProjects;

    @OneToMany
    private List<Project> scrumMastersProjects;
}
