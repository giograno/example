package legal;

import legal.Main.HasMethodThatContainsReferenceToEnclosingInstance;
import legal.Main.HasMethodThatContainsThisReferenceToEnclosingInstance;

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

	public String generated_5639840960744868062(Main main) {
		if ("A".equals("A")) {
			return c.moreFred();
		} else {
			return c.fred();
		}
	}

	public String generated_3625136352441060720(Main main) {
		if ("A".equals("B"))
			return c.moreFred();
		return "NO";
	}

	public String generated_6905808709584343517(Main main) {
		if ("A".equals("B"))
			return c.moreFred();
		else
			return c.fred();
	}

	public String generated_1248195459285459966(Main main) {
		return c.moreFred();
	}

	public String generated_8322222017903134762(Main main) {
		if ("A".equals("B")) {
			return c.moreFred();
		} else {
			if ("C".equals("D")) {
				return c.moreFred();
			} else if ("A".equals("A")) {
				return c.moreFred();
			} else {
				return c.fred();
			}
		}
	}

	public String generated_4997462760102217777(Main main) {
		if ("A".equals("B")) {
			if ("C".equals("D")) {
				return c.moreFred();
			} else if ("A".equals("A")) {
				return c.moreFred();
			} 
		} else {
			return c.moreFred();
		}
		return "NO";
	}

	public String generated_7586941270265564758(Main main) {
		return c.moreFred();
	}

	public String generated_1835535834347878958(Main main) {
		return c.moreFred();
	}

	public String generated_7721547285948236787(Main main) {
		return c.moreFred();
	}

	public String generated_2943071055761040457(Main main) {
		return c.moreFred();
	}

	public String generated_1843905736476100572(Main main) {
		return c.moreFred();
	}

	public String generated_9049293091119187326(Main main) {
		return c.moreFred();
	}

	public String generated_2895556344167341322(Main main) {
		return c.moreFred();
	}

	public String generated_7433836285919325618(Main main) {
		return c.moreFred();
	}

	public String generated_4829907889877899283(Main main) {
		return c.moreFred();
	}

	public void generated_8391680685262370365(HasMethodThatContainsReferenceToEnclosingInstance hasmethodthatcontainsreferencetoenclosinginstance) {
		c.moreFred();
		foo();
	}

	public void generated_1653433171234170192(HasMethodThatContainsThisReferenceToEnclosingInstance hasmethodthatcontainsthisreferencetoenclosinginstance) {
		c.moreFred();
		foo();
	}
}