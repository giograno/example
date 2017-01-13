package searchBased;
// Do not touch me

class IContainManyTypes {
	A a = new A();
	B b = new B();

	private void foo() {
		a.c.fred();
		a.b.foo();
		b.a.foo();
	}
}

class IAmAnotherType {
	A a = new A();
	B b = new B();

	private void foo() {
		a.c.fred();
		a.b.foo();
		b.a.foo();
	}
}