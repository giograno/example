package qualified;

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
}