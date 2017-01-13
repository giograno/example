package legal;

public class B {
	C c;

	public B() {
	}

	public B(Object o) {
	}

	public void bar() {
		if (true) {
			System.out.println("true");
		} else {
			System.out.println("bar");
		}
	}

	public void foo() {
		return;
	}

	public B newB() {
		return new B();
	}
}