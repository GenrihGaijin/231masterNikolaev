package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    User show(int id);
    void update(User updatedUser);
    void delete(int id);
}
