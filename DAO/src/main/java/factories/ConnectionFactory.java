package factories;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionFactory {
    private static ConnectionFactory instance;

    private Connection connection;

    private Properties properties;
    private static final String PROPERTIES_FILE = "C:\\Users\\Daniil\\Desktop\\" +
            "javaprog\\DAO\\src\\main\\resources\\application.proterties";

    static {
        instance = new ConnectionFactory();
    }

    private ConnectionFactory() {
        try {
            properties = new Properties();
            properties.load(new FileInputStream(PROPERTIES_FILE));
            String driverClassName = properties.getProperty("database.driver");
            String url = properties.getProperty("database.url");
            String name = properties.getProperty("database.name");
            String password = properties.getProperty("database.password");


            Class.forName(driverClassName);

            this.connection = DriverManager.getConnection(url, name, password);
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static ConnectionFactory getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
