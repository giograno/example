package unfixes;

public class B {
	public A a;
	public B b;
	public C c;
	public D d;
	
	public void bar() {
		if (true) {
			System.out.println("true");
		} else {
			System.out.println("bar");
		}
	}
	
	public void foo() {
		return;
	}

	public void generated_468743218205854153() {
		foo();
		bar();
	}
}