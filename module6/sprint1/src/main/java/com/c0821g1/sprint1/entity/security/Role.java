package com.c0821g1.sprint1.entity.security;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleId;
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private List<AppUser> appUsers;

    public Role() {
    }

    public Role(int roleId, String roleName, List<AppUser> appUsers) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.appUsers = appUsers;
    }


    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<AppUser> getAppUsers() {
        return appUsers;
    }

    public void setAppUsers(List<AppUser> appUsers) {
        this.appUsers = appUsers;
    }
}
