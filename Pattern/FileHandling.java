import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hi I am Rishabh and I am making this file to test my practise file handling using java.");
            writer.close();
            System.out.println("Successfully wrote to the file!");
        }catch(IOException e){
            e.getMessage();
        }
        try {
            File file = new File("example.txt");
            System.out.println("Does the file exist: "+file.exists());
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            System.out.println("Successfully read the file!");
            reader.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
        int count = 0;
        File f = new File("Pattern");
        String str[] = f.list();
        for(String name :  str){
            count++;
            System.out.println(name);
        }
        System.out.println("Count: "+count);
    }
}

