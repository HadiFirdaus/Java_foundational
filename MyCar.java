/**
    MyCar.java
 */
public class MyCar{

    static void myStatic(){
        System.out.println("No object is created but accessable");
    }
    public void myPublic(){
        System.out.println("Object is created therefore accessable");
    }
    public void fulltrottle() {
        System.out.println("Going fast");
    }
    public void speed(int speed) {
        System.out.println("Speed: "+speed);
    }
public static void main(String[] args) {
    
    //myStatic();

    //first benda = new first(); //ENCAPSULATION
    //benda.setName("Kham"); //SET
    //System.out.println(benda.getName()); //GET
} 
}