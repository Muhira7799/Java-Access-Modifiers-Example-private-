class A {
    // Changed 'private' to 'public' to allow access from Class B
   private void show() {
        System.out.println("Hello");
    }
}

public class B {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}