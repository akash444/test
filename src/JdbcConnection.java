
import java.sql.*;

public class JdbcConnection {
    public Connection con;
    public Connection connectJd(){
    
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver loaded sucessfully ");
        }
        catch(ClassNotFoundException e){
            System.out.println("Driver not found");
        }
        try{
        con=DriverManager.getConnection(url, "akash","priya");
        System.out.println("Connection established sucessfully");
        
        }
        catch(SQLException e){
            System.out.println("Connection cannot be established due to wrong username or pass or localhost failuer");
        }
        return con; 
    
    }
    
    public void hello(){
        System.out.println("hello");
    }
}
