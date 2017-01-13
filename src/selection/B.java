package selection;

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

	public void generated_1217752098808237352() {
		foo();
		bar();
	}

	public void generated_5337467018616092852() {
		foo();
		bar();
	}
}