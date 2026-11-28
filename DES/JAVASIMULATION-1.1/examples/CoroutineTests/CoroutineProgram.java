import javaSimulation.*;

public class CoroutineProgram extends Coroutine {
    Coroutine a, b;

    public void body() {
        a = new A();
        b = new B();
        resume(a);
        System.out.print("STOP1 ");
    }

    class A extends Coroutine {
        public void body() {
            System.out.print("A1 ");
            resume(b);
            System.out.print("A2 ");
            resume(b);
            System.out.print("A3 ");
        }
    }

    class B extends Coroutine {
        public void body() {
            System.out.print("B1 ");
            resume(a);
            System.out.print("B2 ");
            resume(a);
            System.out.print("B3 ");
        }
    }

    public static void main(String args[]) {
        resume(new CoroutineProgram());
        System.out.println("STOP2");
    }
}

/*

Expected output:

A1 B1 A2 B2 A3 STOP1 STOP2

*/		
