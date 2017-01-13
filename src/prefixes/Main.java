package prefixes;

public class Main {
	A a = new A();

	private void withoutSimpleExpressions() {
		a.b.foo();
		if (a.b.bool())
			a.c.fred();
	}
	
	private void withSimpleExpression() {
		B b = new B();
		a.b.foo();
		if (a.b.bool())
			a.c.shit(b);
	}
}