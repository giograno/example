package prefixes;

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

	public void generated_6193602207250308585(Main main) {
		b.foo();
		if (b.bool())
			c.fred();
	}

	public void generated_1500142738949456808(Main main, B b) {
		this.b.foo();
		if (this.b.bool())
			c.shit(b);
	}
}