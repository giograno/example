package packageWideSearchBased;

public class A {
	public A a;
	public B b;
	public C c;
	public D d;
	
	public void foo() {
		if (true) {
			System.out.println("true");
		} else {
			System.out.println("foo");
		}
	}
	
	public void generated_4581347205964746668(Main main) {
		b.foo();
	}

	public void generated_811386902157979493(Main main) {
		b.c.d.bar();
		b.c.b.bar();
	}

	public void generated_4395598232828139146(Main main) {
		b.c.d.bar();
		b.c.b.bar();
	}

	public static class DuplicateType {
		String data = "data";
	}
}