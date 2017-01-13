package searchBased;

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
	
	public void generated_8200837219513438558(IContainManyTypes icontainmanytypes) {
		c.fred();
		b.foo();
	}

	public void generated_8633838159666823575(IAmAnotherType iamanothertype) {
		c.fred();
		b.foo();
	}

	public void generated_595292087136196277(Main main) {
		b.foo();
	}

	public void generated_4643039210864900915(Main main) {
		b.c.d.bar();
		b.c.b.bar();
	}

	public void generated_142529953282392636(Main main) {
		b.c.d.bar();
		b.c.b.bar();
	}

	public static class DuplicateType {
		String data = "data";
	}
}