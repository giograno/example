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
			b.generated_9219885326890774116(this);
			break;
		default:
			a.foo();
		}
	}
}