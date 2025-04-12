import java.sql.*;
import java.io.*;
public class InsertImage {
    public static void main(String[] args) {
        try{
        //Creating a connection
        Connection connection = ConnectionProvider.getConnection();
        System.out.println("Connection created...");

        //SQL query
        String sqlQuery = "INSERT INTO Images(NAME,PIC) VALUES (?,?)";

        PreparedStatement ps = connection.prepareStatement(sqlQuery);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the picture: ");
        String name = br.readLine();
        System.out.println("Enter file path: ");
        String path = br.readLine();
        
        FileInputStream fis = new FileInputStream(path);
        ps.setString(1,name );
        ps.setBinaryStream(2, fis,fis.available());

        ps.executeUpdate();
        System.out.println("Task successfully executed...");

        connection.close();
        System.out.println("Connection closed...");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
