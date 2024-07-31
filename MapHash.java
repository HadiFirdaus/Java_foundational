/**
 * MapHash & Wrapper Class
 */
import java.util.HashMap;   //header HashMap package

public class MapHash {
    public static void main(String[] args) {

        //HashMap<String, Integer> candidate = new HashMap<String, Integer>(); //other type
        HashMap<String, String> capitalCity = new HashMap<String, String>();
        capitalCity.put("Selangor", "KL");
        capitalCity.put("Johor", "Johor Bahru");
        capitalCity.put("Pahang", "Kuantan");
        capitalCity.put("Perlis", "TI");
        System.out.println(capitalCity);

        for (String i : capitalCity.keySet()) {
            System.out.println(i);
        
        }
        for (String i : capitalCity.values()) {
            System.out.println(i);
        }
    }
}