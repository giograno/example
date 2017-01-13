package longestCommonPrefixAnalyzerTest;

public class TestData {
	public void foo() {
		A a = new A();
		a.b.c.fooBar();
		a.b.c.f();
		if(a.b.d.f()){
			a.b.c.g(a.b.c);
			a.b.bar();
		}
	}
	
	public void bar() {
		A a = new A(); 
		a.c.d.bar(); 
		a.c.b.bar(); 
		a.c.b.bar();
	}
}