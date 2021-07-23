package JavaTrickyQuestion.question5;

class A{
    public void printStringData(Object obj){
        System.out.println("Method with object is called !!!");
    }
    public void printStringData(String str){
        System.out.println("Method with String is called !!!");
    }
}
public class Question5 {
    public static void main(String[] args) {
        A a = new A();
        a.printStringData(null);
    }
}
