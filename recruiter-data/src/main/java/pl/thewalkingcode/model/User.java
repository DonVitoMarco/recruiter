package pl.thewalkingcode.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class User extends BaseEntity implements Serializable {

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String salt;

    @Column
    private String name;

    @Column
    private String surname;

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id", table = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", table = "id")
    )
    private Set<Role> roles;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
