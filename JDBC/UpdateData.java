import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateData {
    public static void main(String[] args) {
        try{
            //Establishing database connection
        Connection connection = MyConnection.getConnection("root", "R1shabh_s1ngh", "mydb");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String query = "UPDATE employee SET FirstName = ? , LastName = ? , Age = ?,Salary=?  WHERE Id = ?";
        System.out.println("Enter new First name: ");
        String Firstname = br.readLine();
        System.out.println("Enter new last name: ");
        String LastName = br.readLine();
        System.out.println("Enter new age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Enter id: ");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Enter new salary: ");
        double salary = Double.parseDouble(br.readLine());
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, Firstname);
        preparedStatement.setString(2, LastName);
        preparedStatement.setInt(3, age);
        preparedStatement.setDouble(4, salary);
        preparedStatement.setInt(5, id);
        int result = preparedStatement.executeUpdate();
            if(result!=0){
                System.out.println("Success!!");
                connection.close();
            }else{
                System.out.println("Failed!!");
                connection.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
