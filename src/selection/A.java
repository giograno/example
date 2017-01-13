package selection;

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

	public void generated_1293044788145306806(Main main) {
		b.foo();
	}

	public void generated_8672360478122020962(Main main) {
		b.c.d.bar();
		b.c.b.bar();
	}

	public void generated_6732746596385897607(Main main) {
		b.c.d.bar();
		b.c.b.bar();
	}

	public void generated_6428025074353090706(Main main) {
		b.c.d.bar();
		b.c.b.bar();
	}
}