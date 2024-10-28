import java.sql.*;
public class InsertData {
    public static void main(String[] args) {
        try{
            //loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Creating a connection
            String url ="jdbc:mysql://localhost:3306/myDb";
            String username = "root";
            String password = "R1shabh_s1ngh";

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection created...");

            //SQL query for insering data into tables
            String sqlQuery = "INSERT INTO Employee(Firstname,LastName,Age,Salary) VALUES (?,?,?,?)";
            
            //Get the PreparedStatement object
            PreparedStatement ps = connection.prepareStatement(sqlQuery);

            //set the values of the query
            ps.setString(1, "Rohan");
            ps.setString(2,"Kumar");
            ps.setInt(3,20);
            ps.setDouble(4, 50000.0);
            
            //executing the query
            ps.executeUpdate();
            System.out.println("Date inserted successfully...");


            connection.close();
            System.out.println("Connection closed...");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
