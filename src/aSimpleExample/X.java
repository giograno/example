package aSimpleExample;

public class X {
	
	public X() {
		
	}
	
	public void m(C c) {
		System.out.println("m: " + this.hashCode());
		c.x = new X();
	}
	
	public void n() {
		System.out.println("n: " + this.hashCode());
	}
}