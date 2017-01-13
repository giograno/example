package aPackage;

public class Utils {

	public T foo(T1 x, T2 y) {
		x.bar();
		y.bar();
		return new T();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utils().foo(new T1(), new T2());

	}
	

}
