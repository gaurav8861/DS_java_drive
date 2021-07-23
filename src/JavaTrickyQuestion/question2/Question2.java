package JavaTrickyQuestion.question2;

class A{
    A(){
        System.out.println("A");
    }
}
class B extends A {
    B(){
        System.out.println("B");
    }
}
class C extends B {
    public void printc(){
        System.out.println("C");
    }
}

public class Question2 {
    public static void main(String[] args) {
        C c = null;
        c.printc();
    }
}
