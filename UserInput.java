//import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class UserInput{
     public static void main(String[] args) {
         /*
         Scanner myEmployee = new Scanner(System.in);

         System.out.println("Name:");
         String name = myEmployee.nextLine();

         System.out.println("Salary:");
         int salary = myEmployee.nextInt();

         System.out.println("Age:");
         int age = myEmployee.nextInt();

         System.out.println(name+", "+age+", "+salary);

         myEmployee.close();
         */

         LocalDate haribulan = LocalDate.now();
         System.out.println(haribulan);
         LocalTime waktu = LocalTime.now();
         System.out.println(waktu);
         LocalDateTime hariWaktu = LocalDateTime.now();
         System.out.println(hariWaktu);

         DateTimeFormatter formatTarikh = DateTimeFormatter.ofPattern("MMM dd, yyyy. hh:mm:ss");
         String format = hariWaktu.format(formatTarikh);
         System.out.println(format);

        

        
     }
 }