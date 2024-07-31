/**
 * Inheritance.java
 */
class Vehicle { //Superclass-parent
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Pon! pon!");
    }
}

class Car extends Vehicle{ //Subclass-child                      //Inheritance. Using keyword 'extends'
    private String car ="Mustang";

public static void main(String[] args) {
    
    Car my = new Car();
    my.honk();                              //call the honk() method (from the Vehicle class) on the my object
    System.out.println(my.car+" "+my.brand);


    
}
}