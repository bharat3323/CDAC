class A {
    String a;

    public A(String a) {
        this.a = a;
    }

    void method1(String s) {
        System.out.println(s);
    }
}

public class B extends A {

    public B(String a) {
        super(a);
    }

    void method2(String s) {
        System.out.println(s);
    }
}

class main {
    public static void main(String[] args) {
        A a = new B("Bharat");

    }
}
