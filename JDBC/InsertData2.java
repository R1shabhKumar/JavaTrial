import java.sql.*;
import java.io.*;

public class InsertData2 {
    public static void main(String[] args) {
        try{
        //Loading the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Creating a connection
        java.lang.String url = "jdbc:mysql://localhost:3306/myDb";
        String username = "root";
        String password = "R1shabh_s1ngh";
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("Connection created...");

        String sqlQuery = "INSERT INTO Employee2(FirstName,LastName,Age,Salary) VALUES (?,?,?,?)"; //SQL command

        PreparedStatement ps = connection.prepareStatement(sqlQuery);
        //Using BufferedReader to take user input for the data
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first name: ");
        String fName = br.readLine();
        System.out.println("Enter last name: ");
        String lName = br.readLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Enter salary: ");
        Double sal = Double.parseDouble(br.readLine());
        
        //Using the user input to assign values in PreparedStatement
        ps.setString(1, fName);
        ps.setString(2, lName);
        ps.setInt(3, age);
        ps.setDouble(4, sal);

        //Executing the Query
        ps.executeUpdate();

        //Connection closed
        connection.close();
        System.out.println("Connection closed...");
        
    }catch(Exception e){
        e.printStackTrace();
    }
}
}
