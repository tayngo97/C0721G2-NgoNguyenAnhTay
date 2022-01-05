package com.example.furama.model.employee;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue
    private Integer roleId;

    private String roleName;

    @ManyToMany
    @JoinTable(name="role_user",joinColumns = @JoinColumn(name = "role_id"),inverseJoinColumns = @JoinColumn(name= "user_name"))
    private Set<User> users;

    public Role() {
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
