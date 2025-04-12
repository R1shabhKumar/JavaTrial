import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection{
    private static Connection connection;
    
    public static Connection getConnection(String username,String password,String database){
        if(connection==null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/"+database;
                connection = DriverManager.getConnection(url, username, password);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return connection;
    }
}