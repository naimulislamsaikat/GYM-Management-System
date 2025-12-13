
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost/fitnessclubdb";
    private static final String USER = "root";
    private static final String PASSWORD = "Khejur@123";
    private static Connection conn = null;

    public static Connection getConnection()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully!");
        } 
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error connecting to database!");
            e.printStackTrace();
        }
        return conn;
    }
}
