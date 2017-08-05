package pl.thewalkingcode.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class User extends BaseEntity implements Serializable {

    private String login;
    private String password;
    private String name;
    private String surname;
    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id", table = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", table = "id")
    )
    private Set<Role> roles;

}
