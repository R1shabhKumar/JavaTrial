import java.sql.*;
public class CreateTable {
    public static void main(String[] args) {
        try{
            Connection connection = ConnectionProvider.getConnection();
            System.out.println("Connection created...");

            //SQL query for creating table
            String sqlQuery = "CREATE TABLE IF NOT EXISTS Employee2(Id INT PRIMARY KEY AUTO_INCREMENT,FirstName VARCHAR(50),LastName VARCHAR(50),Age INT,Salary DECIMAL(10,2))";
            
            //Creating a statement
            Statement statement = connection.createStatement();

            statement.executeUpdate(sqlQuery);
            System.out.println("table created in the database");
            connection.close();
            System.out.println("Connection closed...");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
