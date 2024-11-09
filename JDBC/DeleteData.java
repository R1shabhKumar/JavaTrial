import java.sql.*;
import java.util.Scanner;
import java.io.*;
public class DeleteData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the database: ");
        String database = sc.nextLine();
        try{
            //Loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Creating a connection
            String url = "jdbc:mysql://localhost:3306/"+database;
            String username = "root";
            String password = "R1shabh_s1ngh";
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection created...");

            //Using BufferedReader to take user input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the table name: ");
            String table = br.readLine();
            System.out.println("Enter the deleting condition:");
            String condition = br.readLine();

            //Using user input to frame the final SQL query
            String sqlQuery = "DELETE FROM "+table+" WHERE "+condition+";";

            //Executing the SQL query
            PreparedStatement ps = connection.prepareStatement(sqlQuery);
            ps.executeUpdate();
            System.out.println("Task successfully completed...");

            //Closing the connection
            connection.close();
            System.out.println("Connection closed...");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
