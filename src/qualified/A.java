package qualified;

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

	public void generated_839550697710663472(Main main) {
		b.c.d.bar();
		b.c.d.foo();
		b.c.b.bar();
		b.c.b.bar();
	}
}