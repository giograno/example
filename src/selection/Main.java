package selection;

public class Main {
	B b = new B();

	private void simpleMethod() {
		// Don't touch me
		A a = new A();
		a.generated_1293044788145306806(this);
	}

	private void testing() {
		A a = new A();
		a.generated_8672360478122020962(this);
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
		a.generated_6732746596385897607(this);
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
		a.generated_6428025074353090706(this);
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
				b.generated_1217752098808237352();
			}
		};
	}

	private void iHaveALocalClass() {
		class ALocalClass {
			public void foo(B b) {
				b.generated_5337467018616092852();
			}
		}
	}
}