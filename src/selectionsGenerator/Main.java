package selectionsGenerator;

public class Main {
	B b = new B();
	boolean bool = Boolean.parseBoolean("true");
	int theAnswer = Integer.parseInt("42");

	private void simpleStatements() {
		// Do not touch
		A a = new A();
		a.b.c.d.bar();
		a.b.c.b.bar();
	}

	private void containingBlock() {
		// Do not touch
		{
			b.c.d.bar();
			b.c.b.bar();
		}
	}

	private void containingDo() {
		// Do not touch
		do {
			b.c.d.bar();
		} while (bool);

		do
			b.c.d.bar();
		while (bool);
	}

	private void containingEnhancedFor() {
		// Do not touch
		for (String s: new String[] {"1", "2", "3"}) {
			b.c.b.fred(s);
		}

		for (String s: new String[] {"1", "2", "3"})
			b.c.b.fred(s);
	}

	private void containingFor() {
		// Do not touch
		for (int i = 0; i < 5; i++) {
			b.c.b.fred(i);
		}

		for (int i = 0; i < 5; i++)
			b.c.b.fred(i);
	}

	private void containingIfElse() {
		// Do not touch
		if (bool) {
			b.c.d.bar();
		} else {
			b.c.b.bar();
		}

		if (bool)
			b.c.d.bar();
		else if (!bool)
			b.c.b.bar();
		else 
			b.bar();
	}

	private void containingLabel() {
		// Do not touch
		lbl: 
		{
		b.c.d.bar();
		}

	lbl2:
		b.bar();
	}

	private void containingSwitch() {
		// Do not touch
		switch (theAnswer) {
		case 42:
			System.out.println("Correct!");
			break;
		case 666:
			System.out.println("This is not the answer!");
		default:
			System.out.println("Wrong...");
		}
	}

	private void containingWhile() {
		// Do not touch
		while (bool) {
			b.c.b.bar();
		}

		while (bool)
			b.c.b.bar();
	}

	//TODO: more complex example?

}