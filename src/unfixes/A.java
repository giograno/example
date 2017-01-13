package unfixes;

public class A {
	public A a;
	public B b;
	public C c;
	public D d;
	
	public void foo() {
		if (true) {
			System.out.println("true");
		} else {
			System.out.println("foo");
		}
	}

	public void generated_9089953769120238831() {
		foo();
		foo();
	}
}