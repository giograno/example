package aSimpleExample;

public class X {
	
	public X() {
		
	}
	
	public void m(C c) {
		System.out.println("m: " + this.hashCode());
		c.generated_6636147802643615007(this);
	}

	public void n() {
		System.out.println("n: " + this.hashCode());
	}

	public void generated_9138188981384756320(C c) {
		m(c);
		n();
	}
}