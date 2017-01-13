package qualified;

public class Main {
	B b = new B();

	private void testing() {
		A a = new A();
		a.c.d.b.bar();
		if (a.c.d.equals(a.c.a)) {
			a.c.d.b.a.b.bar();
			a = a.c.d.b.a;
		}
		a.b.c.d.bar();
		a.b.c.d.foo();
		a.b.c.b.bar();
		a.b.c.b.bar();
		b.c.a.foo();
	}

	public static void main(String args[]) {
		new Main().testing();
	}
}