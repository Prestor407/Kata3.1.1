package ru.javamentor.spring_boot.service;



import ru.javamentor.spring_boot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    List<User> getListOfUsers();

}
