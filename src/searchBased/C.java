package searchBased;

public class C {
	public A a;
	public B b;
	public C c;
	public D d;
	
	public String fred() {
		boolean f1 = true;
		if (f1) {
			boolean f2 = false;
			if (f2) {
				System.out.println("fred");
				while (f2) {
					f2 = false;
					return "testing";
				}
			} else {
				return "yep";
			}
		} else {
			System.out.println("more fred");
		}
		return "test";
	}
	
	public String moreFred() {
		return "More fred!";
	}
}