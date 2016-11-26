package DAO;

import model.Auto;

import java.util.List;


public interface AutoDao {

    public List<Auto> findAll();

    Auto find (int id);

    void save(Auto auto);

    void delete(int id);

    void update(Auto auto);

    List<Auto> findAllCarsByOwnerId (int ownerId);
}

