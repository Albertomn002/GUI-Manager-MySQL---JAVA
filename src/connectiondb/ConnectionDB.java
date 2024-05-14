package connectiondb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.sql.SQLException;


public class ConnectionDB {
    
    static Connection connection = null;
    static String databaseName = "";
    static String url = "jdbc:mysql://localhost:3306/" +databaseName;
    static String username = "AlbertoMN";
    static String password = "Slenderman123*";
    
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
         
         Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
         connection = DriverManager.getConnection(url, username, password);
         PreparedStatement ps = connection.prepareStatement("INSERT INTO `prueba`.`empleados` (nombre, apellido, salario, email) VALUES ('Rodrigo', 'Matinez', '10', 'Mrdrigo@work.com')");
         
         int status = ps.executeUpdate();
         
         if (status != 0){
         System.out.println("base de datos conectada");
         System.out.println("se ha realizado el registro");
        }
        
    }
}
