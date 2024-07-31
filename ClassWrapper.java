/**
 * Class Wrapper
 */
public class ClassWrapper {
    public static void main(String[] args) {
            //wrapper class
        Integer digitD = 123;
        Double perpuluhanP = 1.44;
        String myString = "hahahah";

        Integer num1 = 100;
        Integer num2 = 100;
        Integer num11=num1.intValue();
        Integer num22=num2.intValue();

        String myOther = num1.toString();

        System.out.println("The length of num1 after converted into string: "+myOther.length());
        System.out.println(num11+num22);
        System.out.println(digitD.intValue());
        System.out.println(perpuluhanP.doubleValue());
        System.out.println(myString);
        Integer tukarString = digitD; 
        System.out.println(tukarString.toString()); //convert int elements to string elements
    }
}