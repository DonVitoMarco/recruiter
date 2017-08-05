package pl.thewalkingcode.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Role extends BaseEntity implements Serializable {

    private String name;
    private String description;
    @ManyToMany(mappedBy = "roles")
    private Set<User> user;

}
