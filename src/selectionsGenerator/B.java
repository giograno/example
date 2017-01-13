package selectionsGenerator;

public class B {
	public A a;
	public B b;
	public C c;
	public D d;
	
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
	
	public void fred(Object s) {
		System.out.println(s.toString());
	}

	public void generated_2879817197261847884(Main main) {
		{
			c.d.bar();
			c.b.bar();
		}
	}

	public void generated_610383947036121620(Main main) {
		c.d.bar();
	}

	public void generated_1067620951861296031(Main main) {
		for (String s: new String[] {"1", "2", "3"}) {
			c.b.fred(s);
		}
	
		for (String s: new String[] {"1", "2", "3"})
			c.b.fred(s);
	}

	public void generated_6982042599894958465(Main main) {
		for (int i = 0; i < 5; i++) {
			c.b.fred(i);
		}
	
		for (int i = 0; i < 5; i++)
			c.b.fred(i);
	}

	public void generated_6151558631089659853(Main main) {
		c.b.bar();
	}

	public void generated_1288232162613999292(Main main) {
		lbl: 
		{
		c.d.bar();
		}
	
	lbl2:
		bar();
	}

	public void generated_914866597916157435(Main main) {
		c.b.bar();
	}
}