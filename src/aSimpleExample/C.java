package aSimpleExample;

public class C {
	
	public X x;
	
	public C() {
		x = new X();
	}
	
	public void f() {
		x.generated_9138188981384756320(this);
	}

	public void generated_6636147802643615007(X x) {
		x = new X();
	}

	public static void main(String[] args) {
		C c = new C();
		c.f();
	}
	
}