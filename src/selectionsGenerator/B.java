package selectionsGenerator;

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
	
	public void fred(Object s) {
		System.out.println(s.toString());
	}
}