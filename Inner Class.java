/**
 * Inner Classes
 */
class Outer{    //Luar
    int x =10;

    class Inner{    //dalam #1
        int y=5;
    }
    class InnerAccessable{  //dalam #2
        public int ex() {
            return x;
        }
    }
    static class InnerStatic{ //dalam #3 (jenis static) 
        int z=20;
    }
public static void main(String[] args) {

    Outer myOuter = new Outer();    //object untuk luar

    Outer.Inner myInner =myOuter.new Inner();   //object untuk dalam #1
    System.out.println(myInner.y+myOuter.x);

    Outer.InnerAccessable myInnerAccess=myOuter.new InnerAccessable();  //object untuk dalam #2
    System.out.println(myInnerAccess.ex());

    Outer.InnerStatic myInnerStatic = new Outer.InnerStatic(); //#3 access class without creating object
    System.out.println(myInnerStatic.z);
}
}