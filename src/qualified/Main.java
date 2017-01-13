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
		a.generated_839550697710663472(this);
		b.c.a.foo();
	}

	public static void main(String args[]) {
		new Main().testing();
	}
}