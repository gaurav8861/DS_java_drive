package JavaTrickyQuestion.question1;


class A{
    public void printData(){
        System.out.println("A");
    }
}
class B extends A{
    public void printData(){
        System.out.println("B");
    }
}
class C extends B{
    public C() {
        System.out.println("C");
    }
}

public class Question1 {
    public static void main(String[] args) {
        C c=new C();
    }
}
