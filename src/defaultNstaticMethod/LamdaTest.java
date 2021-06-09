package defaultNstaticMethod;


interface A {

    void show();

//    default public void display(){
//        System.out.println("Interface A ==> display");
//    }

}

interface B {
    void show();

    default public void display(){
        System.out.println("Interface B ==> display");
    }
}

class AB implements A,B{

    @Override
    public void show() {

    }

//    @Override
//    public void display() {
//        System.out.println("Class AB");
//    }
}
public class LamdaTest {

    public static void main(String[] args) {
        AB ab = new AB();
        ab.display();
    }
}
