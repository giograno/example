package aSimpleExample;

public class C {
	
	public X x;
	
	public C() {
		x = new X();
	}
	
	public void f() {
		x.m(this);
		x.n();
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.f();
	}
	
}