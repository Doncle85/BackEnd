package com.example.demo;

import com.example.demo.Role;

import javax.persistence.*;
import java.util.List;

@Entity(name = "user")
public class User {

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;

    public String getEmail() { return email; }

    public void setEmail(String email) {
        this.email = email;
    }

    // @Column
   // private boolean enabled;

    /*@ManyToMany
    @JoinTable(
          name = "user_roles",
            joinColumns = @JoinColumn(name = "user_username"),
            inverseJoinColumns = @JoinColumn(name = "role_name"))
    private List<Role> roles;*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }*/
}
