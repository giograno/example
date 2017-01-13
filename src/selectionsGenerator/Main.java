package selectionsGenerator;

public class Main {
	B b = new B();
	boolean bool = Boolean.parseBoolean("true");
	int theAnswer = Integer.parseInt("42");

	private void simpleStatements() {
		// Do not touch
		A a = new A();
		a.generated_4002059432356162902(this);
	}

	private void containingBlock() {
		// Do not touch
		b.generated_2879817197261847884(this);
	}

	private void containingDo() {
		// Do not touch
		do {
			b.c.d.bar();
		} while (bool);

		do
			b.generated_610383947036121620(this);
		while (bool);
	}

	private void containingEnhancedFor() {
		// Do not touch
		b.generated_1067620951861296031(this);
	}

	private void containingFor() {
		// Do not touch
		b.generated_6982042599894958465(this);
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
			b.generated_6151558631089659853(this);
		else 
			b.bar();
	}

	private void containingLabel() {
		// Do not touch
		b.generated_1288232162613999292(this);
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
			b.generated_914866597916157435(this);
	}

	//TODO: more complex example?

}