package unfixes;

public class Main {
	A a = new A();
	boolean bool = true;
	String str = "I'm a string";
	ThaInterface impl = new ImplementingThaInterface();

	private void fieldAccessAssignment() {
		this.a = new A();
	}

	private void regularFieldAssignment() {
		a = new A();
	}

	private void hasSimpleNameWithPrimitiveType() {
		if (bool)
			return;
	}

	private void hasSimpleNameWithStringType() {
		System.out.println(str);
	}

	private void hasSimpleNameWithInterfaceType() {
		System.out.println(impl);
	}

	private void hasSingleVariableDeclaration() {
		TakingB anonymous = new TakingB() {
			@Override
			public void foo(B b) {
				b.generated_468743218205854153();
			}
		};
	}

	private void hasSimpleNameInNullTest() {
		if (a != null) {
			a.generated_9089953769120238831();
		}
	}
}