/**
 * ArrayList
 */
import java.util.ArrayList;
import java.util.Collections;

public class ListArray {
public static void main(String[] args) {
    
    ArrayList<String> microorganisms = new ArrayList<String>(); //dalam primitive data String
    microorganisms.add("Virus");    //add elements <String> "virus"
    microorganisms.add("Bacteria");
    microorganisms.add("Algae");
    microorganisms.add("Amoeba");
    microorganisms.add("Fungus");

    //microorganisms.add("");   //add element
    //microorganisms.get(0);    //Access element by index[0,1,2,...]
    //microorganisms.remove(0); //remove an element by index[0,1,2,...]
    //microorganisms.clear();   //remove all elements
    //microorganisms.size();    //show size of elements

    microorganisms.set(4, "Funguy");
    System.out.println(microorganisms.get(4));

    for (int i = 0; i < microorganisms.size(); i++) {
        System.out.println(microorganisms.get(i));
    }

    ArrayList<Integer> bilangan = new ArrayList<Integer>(); //dalam primiive data Integer
    bilangan.add(3);
    bilangan.add(4);
    bilangan.add(1);
    bilangan.add(2);
    Collections.sort(bilangan); //method susun dari collections class
    for (Integer i : bilangan) {
        System.out.println(i);
    }
    



}
    
}