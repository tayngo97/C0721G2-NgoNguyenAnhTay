package com.codegym.service;

import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{
    private List<User> list = new ArrayList<>();

    @Override
    public void save(User user) {
        list.add(user);
        for (User u: list) {
            System.out.println(u);
        }
    }
}
