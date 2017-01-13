package selection;

public class Main {
	B b = new B();

	private void simpleMethod() {
		// Don't touch me
		A a = new A();
		a.b.foo();
	}

	private void testing() {
		A a = new A();
		a.b.c.d.bar();
		a.b.c.b.bar();
		b.c.a.foo();
	}

	private void emptyMethod() {
		// Keep empty
	}

	private boolean searchableMethod() {
		A a = new A();
		B b = new B();
		a.b.foo();
		b.c.fred();
		a.b.c.d.bar();
		a.b.c.b.bar();
		b.c.fred();
		return true;
	}

	public static void main(String args[]) {
		new Main().testing();
	}

	private boolean anotherSearchableMethod() {
		// Do not touch me
		A a = new A();
		B b = new B();
		a.b.foo();
		b.c.fred();
		a.b.c.d.bar();
		a.b.c.b.bar();
		b.c.fred();
		return true;
	}

	class InnerClass {
		private void methodOfInnerClass() {
		}
	}

	private void iHaveAnAnonymousClass() {
		TakingB anonymous = new TakingB() {
			// Must be the first anonymous class in Main for the tests to pass
			@Override
			public void foo(B b) {
				b.foo();
				b.bar();
			}
		};
	}

	private void iHaveALocalClass() {
		class ALocalClass {
			public void foo(B b) {
				b.foo();
				b.bar();
			}
		}
	}
}