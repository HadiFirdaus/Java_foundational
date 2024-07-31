/**
 * Abstract.java
 */
abstract class Babi {
    public abstract void sound(); //this method body is in inheritance.java file. This method has no body.
    public void bunyi(){
        System.out.println("rrrrrrr");
    }

public static void main(String[] args) {
    kelawar babikelawar = new kelawar();
    babikelawar.sound();
    babikelawar.bunyi();
}
}