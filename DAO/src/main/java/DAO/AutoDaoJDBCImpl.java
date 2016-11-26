package DAO;

import model.Auto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutoDaoJDBCImpl implements AutoDao {

    //language = SQL
    private static final String SELECT_FROM_AUTO = "SELECT * FROM auto;";

    // language=SQL
    private static final String SQL_SELECT_AUTO_BY_ID = "SELECT * FROM auto WHERE id = ?;";

    // language=SQL
    private static final String SQL_SELECT_AUTO_BY_OWNER_ID ="SELECT * FROM auto WHERE ownerid = ?;";

    // language=SQL
    private static final String SQL_INSERT_AUTO = "INSERT INTO auto(ownerid, modelname, mileage) VALUES(?, ?, ?);";

    // language=SQL
    private static final String SQL_DELETE_AUTO = "DELETE FROM auto WHERE id = ?;";

    // language=SQL
    private static final String SQL_UPDATE_AUTO = "UPDATE auto SET ownerid=?, modelname=?, mileage=? WHERE id = ?;";

    private Connection connection;

    public AutoDaoJDBCImpl(Connection connection) {
        this.connection = connection;
    }


    public List<Auto> findAll() {
        List<Auto> autos = new ArrayList<Auto>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_FROM_AUTO);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int ownerid = resultSet.getInt("ownerid");
                int mileage = resultSet.getInt("mileage");
                String modelname = resultSet.getString("modelname");
                autos.add(new Auto.Builder()
                        .setId(id)
                        .setOwnerId(ownerid)
                        .setModelName(modelname)
                        .setMileAge(mileage)
                        .build()
                );
            }
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

        return autos;
    }

    public Auto find(int id) {
        Auto auto = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_AUTO_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int carid = resultSet.getInt("id");
                int owner_id = resultSet.getInt("ownerid");
                int mileage = resultSet.getInt("mileage");
                String model = resultSet.getString("modelname");
                auto = new Auto.Builder()
                        .setId(id)
                        .setOwnerId(owner_id)
                        .setModelName(model)
                        .setMileAge(mileage)
                        .build();
            }
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
        return auto;
    }

    public void save(Auto auto) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_AUTO);
            //preparedStatement.setInt(1, auto.getId());
            preparedStatement.setInt(1, auto.getOwnerId());
            preparedStatement.setString(2, auto.getModelName());
            preparedStatement.setInt(3, auto.getMileAge());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public void delete(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE_AUTO);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public void update(Auto auto) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE_AUTO);
            preparedStatement.setInt(1, auto.getOwnerId());
            preparedStatement.setString(2, auto.getModelName());
            preparedStatement.setInt(3, auto.getMileAge());
            preparedStatement.setInt(4, auto.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

    }

    public List<Auto> findAllCarsByOwnerId(int ownerId) {
        List<Auto> autos = new ArrayList<Auto>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_AUTO_BY_OWNER_ID);
            preparedStatement.setInt(1, ownerId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int owner_id = resultSet.getInt("owner_id");
                int mileage = resultSet.getInt("mileage");
                String model = resultSet.getString("model");
                autos.add(new Auto.Builder()
                        .setId(id)
                        .setOwnerId(owner_id)
                        .setModelName(model)
                        .setMileAge(mileage)
                        .build()
                );
            }
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

        return autos;
    }
}
