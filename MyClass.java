/**
 * MyClass.java
 */
public class MyClass {

int x;
int k;
String fname;
String lname;
final int age=30;

public MyClass(int y){ //CLASS CONSTRUCTOR!!!!!!!!!!!!
    x=y;
    k=6;
}

public static void main(String[] args) {

    /*
    MyClass myObj = new MyClass();
    MyClass myAttribute = new MyClass();
    myAttribute.x=7;
    System.out.println("This is an My object accesses x: "+myObj.x); //5
    System.out.println("This is an Attribute accesses x: "+myAttribute.x); //7
    */

    /*
    MyClass aPerson = new MyClass();
    aPerson.fname="Eddy";
    aPerson.lname="Darwin";
    System.out.println("Name: "+aPerson.fname+" "+aPerson.lname);
    System.out.println("Age "+aPerson.age);
    */

    //myStatic();

    /*
    MyClass object = new MyClass();
    object.myPublic();
    */
    MyClass object = new MyClass(5);
    System.out.println(object.x+" "+object.k);
}
}