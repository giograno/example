package packageWideSearchBased;

import java.util.Arrays;
import java.util.List;

public abstract class Main {
	B b = new B();

	private void simpleMethod() {
		// Don't touch me
		A a = new A();
		a.b.foo();
	}

	private void testing() {
		A a = new A();
		// Duplicate of two lines in searchableMethod
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
		// Duplicate of two lines in testing
		a.b.c.d.bar();
		a.b.c.b.bar();
		b.c.fred();
		return true;
	}
	
	private void takesArrayParameter(A[] as) {
		List<A> l = Arrays.asList(as);
	}
	
	private void iHaveALocalClass() {
		class Local {
			String str = "data";
		}
		
		Local l = new Local();
		System.out.println(l.str);
		System.out.println(l.str);
	}
}