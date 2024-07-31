/**
 * Polymorphism
 */
class Animal{ //superclass-parent
    public void animalSound() {
        System.out.println("Make animal sound");
    }

    //FROM THIS AND FORWARD
    public void animalSpecial(){
        System.out.println("animal special 007");
    }
}
class Cat extends Animal{ //subclass-child
    public void catSound(){
        System.out.println("Meow");
    }

    //FROM THIS AND FORWARD
    public void animalSpecial(){
        System.out.println("cat special 000");
    }
    
}
class Monkey extends Animal{ //subclass-child
    public void monkeySound() {
        System.out.println("monkey sound");
    }
}
public class Polymorphism {
public static void main(String[] args) {
    Animal myCat= new Cat();              //create object  'myCat'
    Animal myMonkey =new Monkey();          //create object 'myConkey'
    

    myCat.animalSound();                  //object 'myCat' inherits animalSound() method from Animal class
    myMonkey.animalSound(); 
    myMonkey.animalSpecial();              //object 'myMonkey' inherits animalSound() method from Animal class
    myCat.animalSpecial();
}
}