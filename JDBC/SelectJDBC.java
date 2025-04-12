import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJDBC {
    public static void main(String[] args) {
        try{
            //Establishing connection with the database
            Connection connection =  MyConnection.getConnection("root", "R1shabh_s1ngh", "mydb");
            String query = "SELECT * FROM employee";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String fname = resultSet.getString(2);
                String lname = resultSet.getString(3);
                int age = resultSet.getInt(4);
                double salary = resultSet.getDouble(5);
                System.out.println();
                System.out.printf("|%-7s|%-25s|%-25s|%-7s|%-20s|",id,fname,lname,age,salary);
                System.out.println();
            }
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
