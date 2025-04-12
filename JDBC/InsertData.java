import java.sql.*;
public class InsertData {
    public static void main(String[] args) {
        try{
            //Creating a connection
            Connection connection = ConnectionProvider.getConnection();
            System.out.println("Connection created...");

            //SQL query for insering data into tables
            String sqlQuery = "INSERT INTO Employee(Firstname,LastName,Age,Salary) VALUES (?,?,?,?)";
            
            //Get the PreparedStatement object
            PreparedStatement ps = connection.prepareStatement(sqlQuery);

            //set the values of the query
            ps.setString(1, "Ram");
            ps.setString(2,"Singh");
            ps.setInt(3,45);
            ps.setDouble(4, 75000.0);
            
            //executing the query
            ps.executeUpdate();
            System.out.println("Data inserted successfully...");


            connection.close();
            System.out.println("Connection closed...");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
