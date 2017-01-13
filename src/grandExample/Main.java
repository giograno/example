package grandExample;

class C {
	A a; B b; boolean bool;

	void method(int val) {
		if (bool) {
			a.foo();
			a = new A();
			a.bar();
		}

		a.foo();
		a.bar();

		switch (val) {
		case 1:
			b.a.foo();
			b.a.bar();
			break;
		default:
			a.foo();
		}
	}
}