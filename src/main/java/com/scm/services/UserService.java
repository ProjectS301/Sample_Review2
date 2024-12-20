package com.scm.services;

import com.scm.entities.User;
import java.util.Optional;
import java.util.*;

public interface UserService {

    User saveUser(User user);

    Optional<User> getUserById(String id);

    Optional<User> updateUser(User user);

    void deleteUser(String id);

    boolean isUserExist(String userId);

    boolean isUserExistByEmail(String email);

    List<User> getAllUsers();

    User getUserByEmail(String email);

    //add more methods here related user service[logic]

}

