package com.azzinnur.PP_3_2.Springbootcrud.service;


import com.azzinnur.PP_3_2.Springbootcrud.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public void add(User user);

    public List<User> getAllUsers();

    public User findUser(long id);

    public void delete(long id);

    public void update(User user);
}
