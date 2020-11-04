package app.service;

import app.model.User;

import java.util.List;

public interface UserService {
    void create(User user);
//    List<User> readAllUsers();
    List<User> getAllUsers();
    //void
    //void update(long id, User user);
    void update(User user, long id);
//    void delete(User user);
    void delete(long id);

//    User findUser(String name);
    User findUserById(long id); //User user
//    List<User> userListByModelAndSeries(String model, int series);

}
