/**
 * Package.java
 */
import java.util.Scanner;

public class Package{

    public static void main(String[] args) {
     
        Scanner myBenda = new Scanner(System.in);
        
        System.out.println("Enter Line: ");
        String newUser = myBenda.nextLine(); //method for line in String
        System.out.println("User name: "+newUser);

        System.out.println("Enter int: ");
        int i = myBenda.nextInt(); //method for integer
        System.out.println("Your int: "+ i);

        System.out.println("Enter double: ");
        Double d = myBenda.nextDouble(); //method for integer
        System.out.println("Your int: "+ d);

        System.out.println("Enter boolean: ");
        boolean b = myBenda.nextBoolean(); //method for integer
        System.out.println("Your int: "+ b);

        myBenda.close();
    }
        
    
}