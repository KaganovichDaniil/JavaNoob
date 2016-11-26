package DAO;

import model.User;

import java.util.List;


public interface UsersDao {

    List<User> findAll();

    User find (int id);

    long save(User user);

    void delete(int id);

    void update(User user);
}
