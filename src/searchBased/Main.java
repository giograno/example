package searchBased;

public abstract class Main {
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

	protected abstract void iAmAbstract();

	/*
	 * This is a multiline comment, not Javadoc.
	 */
	private void iAmPrefixedWithAMultilineComment() {
		return;
	}

	// A single line comment. (Leave this above a method with Javadoc attached!)

	/**
	 * This is Javadoc.
	 */
	private void iHaveJavadocAttachedButThereIsAlsoASingleLineCommentAboveMe() {
		return;
	}

	private void iAmAnOverloadedMethod(DuplicateType type) {
		return;
	}

	private void iAmAnOverloadedMethod(A.DuplicateType type) {
		return;
	}

	private void iHaveATooSimpleBodyToBeConsidered() {
		b.bar();
	}
	
	private String iHaveAConditionalWithAReturnStatement() {
		// Do not touch me
		if ("A".equals("B"))
			return b.c.moreFred();
		return "NO";
	}
}