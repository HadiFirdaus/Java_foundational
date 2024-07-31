/**
 * Exception
 */
public class Exception {
    
    public static void main(String[] args) {
        try {
            int[] senarai ={0,2,4,5};
            System.out.println(senarai[10]);        
        }
        catch (ArrayIndexOutOfBoundsException e) { //ArithmaticException, FileNotFoundException, SecurityException, ArrayIndexOutOfBoundsException
            System.out.println("error by W3SCHOOL.COM");
        }
        finally{
            System.out.println("exception is above");
        }

        int age =19;

        if (age < 18) {
            throw new ArithmeticException("must be 18 and above");
        } else {
            System.out.println("18 and above");
        }
    }
}