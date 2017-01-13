package legal;

public abstract class Main extends SuperMain {
	int i;
	int j;
	final A a;
	B b;
	String st;

	public Main() {
		super();
		a = new A();
	}

	@Override
	protected void superMethod() {
		// Do not touch me
		super.superMethod();
	}

	private void iAccessSuperField() {
		// Do not touch me
		System.out.println(super.superField);
	}

	private void iHaveABreakStatementWithoutALabelInSwitch() {
		// Do not touch me
		switch(i) {
		case 1:
			System.out.println("test");
			break;
		default:
			System.out.println("test2");
		}
	}

	private void iHaveABreakStatementWithoutALabelInWhile() {
		// Do not touch me
		while (i < 3) {
			System.out.println("test");
			if (i++ == 1)
				break;
		}
	}

	private void iHaveABreakStatementWithoutALabelInDo() {
		// Do not touch me
		do {
			System.out.println("test");
			if (i++ == 1)
				break;
		} while (i < 3);
	}

	private void iHaveABreakStatementWithoutALabelInFor() {
		// Do not touch me
		for (int i = 0; i < 3; i++) {
			System.out.println("test");
			if (i == 1)
				break;
		}
	}

	private void iHaveABreakStatementWithoutALabelInEnhancedFor() {
		// Do not touch me
		for (int i: new int[] {0, 1, 2}) {
			System.out.println("test");
			if (i == 1)
				break;
		}
	}

	private void iHaveABreakStatementWithALabelInNestedFor() {
		// Do not touch me
		lbl:
			for (int j = 0; j < 5; j++) {
				for (int i = 0; i < 3; i++) {
					System.out.println("test");
					if (i == 1)
						break lbl;
				}
			}
	}

	private void iHaveAContinueStatementWithoutALabelInWhile() {
		// Do not touch me
		while (i < 3) {
			if (i++ == 1)
				continue;
			System.out.println("test");
		}
	}

	private void iHaveAContinueStatementWithoutALabelInDo() {
		// Do not touch me
		do {
			if (i++ == 1)
				continue;
			System.out.println("test");
		} while (i < 3);
	}

	private void iHaveAContinueStatementWithoutALabelInFor() {
		// Do not touch me
		for (int i = 0; i < 3; i++) {
			if (i == 1)
				continue;
			System.out.println("test");
		}
	}

	private void iHaveAContinueStatementWithoutALabelInEnhancedFor() {
		// Do not touch me
		for (int i: new int[] {0, 1, 2}) {
			if (i == 1)
				continue;
			System.out.println("test");
		}
	}

	private void iHaveAContinueStatementWithALabelInNestedWhile() {
		// Do not touch me
		lbl:
			while (j++ < 5) {
				while (i < 3) {
					if (i++ == 1)
						continue lbl;
					System.out.println("test");
				}
				i = 0;
			}
	}

	private void iHaveASelectionWhichNeedMultipleReturnValues() {
		// Do not touch me
		B b = new B();
		C c = new C();
		int i = 0;
		// Select from here
		c.generated_704847988029803735(this);
		if (b != null) {
			i = 5;
		}
		b = c.b.newB();
		c.b.foo();
		// to here
		System.out.println(b);
		System.out.println(i);
	}

	private String iHaveASelectionWhereAllBranchesEndInReturnButMustReturnTwoValues() {
		// Do not touch me
		A a = new A();
		try {
			// Select from here
			if ("A".equals("B")) {
				return b.c.moreFred();
			} else {
				if ("C".equals("D")) {
					a = new A();
					return b.c.moreFred();
				} else
					return b.generated_5639840960744868062(this);
			}
			// to here
		} catch (Exception e) {
			System.err.println("finally!");
			System.out.println(a);
		}
		return "test";
	}

	class HasMethodThatContainsReferenceToEnclosingInstance {
		// Do not touch me
		Main main;

		public HasMethodThatContainsReferenceToEnclosingInstance(Main main) {
			this.main = main;
		}

		public void foo(B b) {
			// Select from here
			b.c.fred();
			main.fred();
			b.generated_8391680685262370365(HasMethodThatContainsReferenceToEnclosingInstance.this);
			// to here
		}
	}

	public void fred() {
	}

	class HasMethodThatContainsThisReferenceToEnclosingInstance {
		// Do not touch me

		public void foo(B b) {
			// Select from here
			b.c.fred();
			System.out.println(Main.this);
			b.generated_1653433171234170192(HasMethodThatContainsThisReferenceToEnclosingInstance.this);
			// to here
		}
	}

	private String iHaveAConditionalWithAReturnStatement() {
		// Do not touch me
		return b.generated_3625136352441060720(this);
	}

	private String iHaveAConditionalWithAnElseAndAllBranchesEndInReturn() {
		// Do not touch me
		try {
			return b.generated_6905808709584343517(this);
		} catch (Exception e) {
			System.err.println("finally!");
		}
		return "test";
	}

	private String iHaveAConditionalWithAnElseAndNotAllBranchesEndInReturn() {
		// Do not touch me
		if ("A".equals("B"))
			return b.generated_1248195459285459966(this);
		else
			System.out.println("fred");
		return "NO";
	}

	private String iHaveAComplexConditionalWithAnElseAndAllBranchesEndInReturn() {
		// Do not touch me
		try {
			return b.generated_8322222017903134762(this);
		} catch (Exception e) {
			System.err.println("finally!");
		}
		return "test";
	}

	private String iHaveAComplexConditionalWithAnElseAndNotAllBranchesEndInReturn() {
		// Do not touch me
		return b.generated_4997462760102217777(this);
	}

	private String iHaveReturnInsideWhile() {
		// Do not touch me
		boolean bool = true;
		while(bool) {
			if (bool)
				bool = false;
			return b.generated_7586941270265564758(this);
		}
		return b.c.moreFred();
	}

	private String iHaveReturnInsideFor() {
		// Do not touch me
		for(int i = 0; i < 3; i++) {
			if (i == 1)
				return b.generated_1835535834347878958(this);
		}
		return b.c.moreFred();
	}

	private String iHaveReturnInsideCatch() {
		// Do not touch me
		try {
			System.out.print("test");
		} catch (Exception e) {
			return b.generated_7721547285948236787(this);
		}
		return b.c.moreFred();
	}

	private String iHaveALegalSelectionThatContainsConditionalWithBranchNotEndingInReturn() {
		// Do not touch me
		try {
			// Select from here ...
			if ("A".equals("B"))
				return b.c.moreFred();
			else
				System.out.println("fred");

			boolean bool = true;
			while(bool) {
				if (bool)
					bool = false;
				return b.c.moreFred();
			}

			if ("B".equals("B")) {
				if ("B".equals("B")) {
					return b.c.moreFred();
				} else {
					for(int i = 0; i < 3; i++) {
						if (i == 1)
							return b.generated_2943071055761040457(this);
					}
					return b.c.fred();
				}
			} else {
				return b.c.fred();
			}
			// ... to here
		} catch (Exception e) {
		}
		return "FOO";
	}

	private String iHaveALegalSelectionWithThrowThatContainsConditionalWithBranchNotEndingInReturn() {
		// Do not touch me
		try {
			// Select from here ...
			if ("A".equals("B"))
				return b.c.moreFred();
			else
				System.out.println("fred");

			boolean bool = true;
			while(bool) {
				if (bool)
					bool = false;
				return b.c.moreFred();
			}

			if ("B".equals("B")) {
				if ("B".equals("B")) {
					return b.generated_1843905736476100572(this);
				} else {
					for(int i = 0; i < 3; i++) {
						if (i == 1)
							throw new Exception();
					}
					throw new Exception();
				}
			} else {
				return b.c.fred();
			}
			// ... to here
		} catch (Exception e) {
		}
		return "FOO";
	}

	private void iHaveALegalSelectionWithVoidReturn() {
		// Do not touch me
		try {
			// Select from here ...
			if ("A".equals("B"))
				return;
			else
				System.out.println("fred");

			boolean bool = true;
			while(bool) {
				if (bool)
					bool = false;
				return;
			}

			if ("B".equals("B")) {
				if ("B".equals("B")) {
					return;
				} else {
					for(int i = 0; i < 3; i++) {
						if (i == 1)
							throw new Exception();
					}
					throw new Exception();
				}
			} else {
				return;
			}
			// ... to here
		} catch (Exception e) {
		}

		if ("FOO".equals("BAR"))
			return;
	}

	private void iHaveANonLegalSelectionWithVoidReturn() {
		// Do not touch me
		try {
			// Select from here ...
			if ("A".equals("B"))
				return;
			else
				System.out.println("fred");

			boolean bool = true;
			while(bool) {
				if (bool)
					bool = false;
				return;
			}

			if ("B".equals("B")) {
				if ("B".equals("B")) {
					return;
				} else {
					for(int i = 0; i < 3; i++) {
						if (i == 1)
							throw new Exception();
					}
					throw new Exception();
				}
			} else {
			}
			// ... to here
		} catch (Exception e) {
		}

		if ("FOO".equals("BAR"))
			return;
	}

	private String iHaveAnIllegalSelectionContainingReturn() {
		// Do not touch me
		// Select from here ...
		System.out.println("Garbage");
		if ("B".equals("B"))
			return b.generated_9049293091119187326(this);
		System.out.println("More garbage");
		// ... to here.
		return "FOO";
	}

	private String iHaveALegalSelectionContainingReturnInBlock() {
		// Do not touch me
		try {
			// Select from here ...
			System.out.println("Garbage");
			if ("B".equals("B"))
				return b.generated_2895556344167341322(this);
			System.out.println("More garbage");
			{
				return "BAR";
			}
			// ... to here.
		} catch (Exception e) {
		}
		return "FOO";
	}

	private String iHaveALegalSelectionContainingReturnUnderLabel() {
		// Do not touch me
		try {
			// Select from here ...
			System.out.println("Garbage");
			if ("B".equals("B"))
				return b.generated_7433836285919325618(this);
			System.out.println("More garbage");
			lbl: {
				return "BAR";
			}
			// ... to here.
		} catch (Exception e) {
		}
		return "FOO";
	}

	private String iHaveALegalSelectionContainingReturnInDo() {
		// Do not touch me
		try {
			// Select from here ...
			System.out.println("Garbage");
			if ("B".equals("B"))
				return b.generated_4829907889877899283(this);
			System.out.println("More garbage");
			int i = 0;
			do {
				return "BAR";
			} while (i++ < 4);
			// ... to here.
		} catch (Exception e) {
		}
		return "FOO";
	}

	private void iHaveAnIllegalSelectionWithPossibleImplicitReturnInWhile() {
		// Do not touch me
		int i = 0;
		while(i++ < 3) {
			// Select from here ...
			if (i == 1)
				return;
			System.out.println("FOO");
			// ... to here.
		}
	}

	protected abstract void iAmAbstractAndProtected();

	private void iCallAProtectedMethod() {
		// Do not touch me
		// Select from here ...
		int i = 0;
		if (++i == 1)
			iAmAbstractAndProtected();
		System.out.println("FOO");
		// ... to here.
	}

	abstract void iAmAbstractAndDefault();

	private void iCallADefaultMethod() {
		// Do not touch me
		// Select from here ...
		int i = 0;
		if (++i == 1)
			iAmAbstractAndDefault();
		System.out.println("FOO");
		// ... to here.
	}

	public class IAmANonStaticInnerClass {

	}

	private void iUseNonStaticInnerClass() {
		// Do not touch me
		// Select from here ...
		IAmANonStaticInnerClass cls = new IAmANonStaticInnerClass();
		// ... to here.
	}

	private void iContainDoubleConstructorCallWithArgument() {
		// Do not touch me
		// Select from here ...
		A a = new A(new B(st));
		// ... to here for illegal selection.
		// and from here ...
		A a2 = new A(new B());
		// ... to here for legal selection.
		String st2 = "";
		// and from here ...
		A a3 = new A(new B(st2));
		// ... to here for legal selection.
	}
}