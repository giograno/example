package selectionsGenerator;

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

	public void generated_4002059432356162902(Main main) {
		b.c.d.bar();
		b.c.b.bar();
	}
}