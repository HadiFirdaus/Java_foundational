interface firstInterface{
    public void first();
}
interface secondInterface{
    public void second();
}
class Demoface implements firstInterface, secondInterface{  //mmultiple interfaces
    public void first() {
        System.out.println("pertama");
    }
    public void second(){
        System.out.println("kedua");
    }
}
/**
 * Interface
 */
public class Interface {
public static void main(String[] args) {
    Demoface muka = new Demoface();
    muka.first();
    muka.second();
}
}
