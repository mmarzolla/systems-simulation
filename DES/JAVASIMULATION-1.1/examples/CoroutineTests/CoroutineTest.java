import javaSimulation.*;

public class CoroutineTest extends Coroutine {
    CoroutineTest(char cmd) { 
        command = cmd; 
    }

    Coroutine a, b, c;
    char command;	

    class A extends Coroutine {
        public void body() {
            System.out.print("a1"); detach();
	  System.out.print("a2"); call(c = new C());
            System.out.print("a3"); call(b);
            System.out.print("a4"); detach();
        }
    }

    class B extends Coroutine {
        public void body() {
            System.out.print("b1"); detach();
            System.out.print("b2"); resume(c);
            System.out.print("b3"); detach();
        }
    }

    class C extends Coroutine {
        public void body() {
            System.out.print("c1"); detach();
            System.out.print("c2\n"); 
            System.out.println("==> " + command);
            if (command == 'r') 
                resume(a);
            else if (command == 'c') 
                call(a);
            else
                detach();
            System.out.print("c3"); detach();
            System.out.print("c4");
        }
    }

    public void body() {
        System.out.print("m1"); call(a = new A());
        System.out.print("m2"); call(b = new B());
        System.out.print("m3"); resume(a);
        System.out.print("m4"); resume(c);
        System.out.print("m5\n\n");
    }
	
    public static void main(String args[]) {
        resume(new CoroutineTest('r'));
        resume(new CoroutineTest('c'));
        resume(new CoroutineTest('x'));
    } 
}

/*

Expected output:

m1a1m2b1m3a2c1a3b2c2
==> r
b3a4m4c3m5

m1a1m2b1m3a2c1a3b2c2
==> c
b3a4c3m4c4m5

m1a1m2b1m3a2c1a3b2c2
==> x
m4c3m5

*/
