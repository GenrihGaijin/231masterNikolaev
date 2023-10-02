package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    User show(int id);
    void update(User updatedUser);
    void delete(int id);
}
