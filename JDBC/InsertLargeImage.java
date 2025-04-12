import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Scanner;


import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class InsertLargeImage extends Thread{
    public static void main(String[] args) {
        
        try{
            //Using JFileChooser of Java Swing to open a dialog box to select the desired file
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            FileInputStream fis = new FileInputStream(file);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter file name: ");
            String name = sc.next();
            //Loading the driver
            Connection c = ConnectionProvider.getConnection();
            System.out.println("Connection created...");
            
            String query = "INSERT INTO images(NAME,LARGEPIC) VALUES(?,?)";
            PreparedStatement preparedStatement = c.prepareStatement(query);
            preparedStatement.setBinaryStream(2, fis,fis.available());
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
            
            //returning success message
            JOptionPane.showMessageDialog(null, name+" added successfully");
            c.close();
            sc.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
