package com.web.spring_boot.service;

import com.web.spring_boot.model.User;

import java.util.List;

public interface UserService {

    List<User> index();

    User show(long id);

    void save(User user);


    void update(long id, User updateUser);

    void delete(long id);
}
