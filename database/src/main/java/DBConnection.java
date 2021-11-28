import java.sql.*;
import java.util.Properties;

public class DBConnection {
    private String url;
    private Properties properties;
    private Connection connection;

    DBConnection(String url, Properties properties){
        this.url = url;
        this.properties = properties;
    }

    public void init() throws SQLException, ClassNotFoundException {
        if(connection == null) {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, properties);
        }
    }

    protected void finalize() throws  SQLException{
        connection.close();
    }

    public ResultSet getResult(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }

    public void updateQuery(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
    }
}
