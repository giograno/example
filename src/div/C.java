package div;

public class C {
	public B b;
	public C c;
	
	public void fred() {
		boolean f1 = true;
		if (f1) {
			boolean f2 = false;
			if (f2) {
				System.out.println("fred");
				while (f2) {
					f2 = false;
					return;
				}
			} else {
				return;
			}
		} else {
			System.out.println("more fred");
		}
	}
}