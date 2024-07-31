
enum Level{
    LOW,
    MEDIUM,
    HIGH,
}
public class Enum{
    public static void main(String[] args) {
        Level mylvl = Level.HIGH;
        switch ( mylvl) {   //Enum in switch statement
            case LOW:
                System.out.println("level low");
                break;
            case MEDIUM:
                System.out.println("level medium");
                break;
            case HIGH:
                System.out.println("level high");
                break;
            default:
                break;
        }
    
    for (Level mylevel:Level.values()){ //Enum in for loop
        System.out.println(mylevel);
        }
    }
}