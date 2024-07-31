import java.io.*;
import java.io.File;    //import the File class
import java.util.Scanner;

public class HandlingFiles {
    public static void main(String[] args) {
        
        try {

            File myCreate = new File("filename.txt"); //create file named 'filename.txt'
            if (myCreate.createNewFile()) {
                System.out.println(myCreate.getName()+" : is created");
            } else {
                System.out.println(myCreate.getName()+" : is already created");
            }

            FileWriter myWrite= new FileWriter("filename.txt"); //write file
            myWrite.write("'Write the file using Java'");
            myWrite.close();
            System.out.println("Is written");

            File myRead = new File("filename.txt"); //read file
            Scanner read = new Scanner(myRead);
            while (read.hasNextLine()) {
                String writtten = read.nextLine();
                System.out.println(writtten);
            }
            read.close();

            File myDelete =new File("filename.txt");    //delete file
            if (myDelete.delete()) {
                System.out.println(myDelete.getName()+" : is deleted");
            } else {
                System.out.println("Fail to Delete");
            }
        }

        catch (IOException e){
            System.out.println("An Error Occurs!!!");
            e.printStackTrace();
        }
        
        finally{
            System.out.println("Finally Executed");
        }
    }
}