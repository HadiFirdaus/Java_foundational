/**
 * first
 */
public class first {
    private String name;

    static void myTypeCasting(){
        double myDouble = 9.0;
        int myInt = 9;
        int otherDouble = (int) myDouble;
        double otherInt = myInt;
        System.out.println(otherDouble);
        System.out.println(otherInt);
    }
    static void myConcatenation(){
        String firstName = "hadi";
        String lastName = "firdaus";
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName.concat(lastName));
    }
    static void myString(){
        String nameAli = "Catch me if you can";
        System.out.println("Index of: "+nameAli.indexOf("if"));
        System.out.println("Length of nameAli: "+nameAli.length());
        System.out.println("Lower case: "+nameAli.toLowerCase());
        System.out.println("Upper case: "+nameAli.toUpperCase());

        int a=10;
        int b=15;
        int z=a+b;
        String aA="10";
        String bB="15";
        String abBaA=a+bB+aA;
        System.out.println(abBaA);
        System.out.println(z);
    }
    static void myMath(){
        System.out.println(Math.max(10, 5));
        System.out.println(Math.min(10, 5));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.random());
        System.out.println(Math.abs(5));
    }
    static void myIfElse(){
        int a = 10;
        int b = 5;
        if (b>a) {
            System.out.println("a > b");
        }        else if (a>b) {
            System.out.println("a > b");
        }
        else
        {
            System.out.println("a < b");
        }
        //Ternary Operant or short-hand if else
        String result = (b>a) ? "a is greater than b" : "a is smaller than b";
        System.out.println(result);
    }
    static void mySwitch(int day){
        switch (day) {
            case 0:
                System.out.println("Friday");
                break;
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
    static void myWhileLoop(){
        int i = 0;
        while (i<5) {
            System.out.println(i);
            i++;
        }
        do {
            System.out.println(i);
            i++;
        } while (i<5);
    }
    static void myForLoop(){
        for (int i = 1; i <= 10; i=i*2) {
            System.out.println(i);
        }

        String [] cars = {"myvi", "produa", "ford", "honda"};
        for (String i : cars) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("yes");
        }

    }
    static void breakContinue(){

        for (int i = 0; i < 10; i++) {
            if (i==4) {
                continue;
            }
            System.out.println(i);
        }
        int i = 0;
        while (i<10) {
            if (i==4) {
                i++;
                continue;
                //break;
            }
            System.out.println(i);
            i++;
        }
    }
    static void myName(String name, int age){
        System.out.println("My name is:\t" + name + "\tand I'am:\t" + age + "\tyears old");
    }
    static int myReturn(int x, int y){
        return x+y;
    }
    static void myMethodIfElse(int age){
        if (age < 18) {
            System.out.println("high school");
        }
        else if(age >= 20){
            System.out.println("college student");
        }
        else{
            System.out.println(age + "hmm");
        }
    }
    static int myOverloading(int x, int y){
        return x+y;
    }
    static double myOverloading(double x, double y){
        return x+y;
    }
    public String getName(){ //ENCAPSULATION GET
        return name;
    }
    public void setName(String newName) { //ENCAPSULATION SET
        this.name=newName;
    }

    public static void main(String[] args) {
        //myTypeCasting();
        //myConcatenation();
        //myMath();
        //myString();
        //myIfElse();
        //mySwitch(7);
        //myWhileLoop();
        //breakContinue();
        //myForLoop();
        //myName("Hadi", 23);

        /*int z=myReturn(5,5);
        System.out.println(z);
        */

        //myMethodIfElse(20);
        //double myL =myOverloading(2.0, 0.3);
        //System.out.println(myL);
        //myTest(5, 5);

        /*
        MyClass multiClasses = new MyClass(); //constructor problem
        //System.out.println(multiClasses.x);
        multiClasses.fname="Christopher";
        //System.out.println(multiClasses.fname);*/

        /*MyCar proton = new MyCar();
        proton.myPublic();
        proton.fulltrottle();
        proton.speed(200);*/
    }

}