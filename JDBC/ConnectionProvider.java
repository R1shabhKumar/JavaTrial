import java.sql.*;
import java.util.Scanner;

public class ConnectionProvider {
    private static Connection connection;
    static Scanner scanner = new Scanner(System.in);
        public static Connection getConnection(){
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            System.out.print("Enter database name: ");
            String db = scanner.next();
            scanner.close();
        if(connection==null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/"+db;
                connection = DriverManager.getConnection(url, username, password);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return connection;
    }
}
