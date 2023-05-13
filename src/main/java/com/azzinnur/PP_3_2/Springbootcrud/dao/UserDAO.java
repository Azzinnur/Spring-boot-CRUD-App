package com.azzinnur.PP_3_2.Springbootcrud.dao;



import com.azzinnur.PP_3_2.Springbootcrud.model.User;

import java.util.List;

public interface UserDAO {
    public void add(User user);

    public List<User> getAllUsers();

    public void delete(long id);

    public User findUser(long id);

    public void update(User user);

}
