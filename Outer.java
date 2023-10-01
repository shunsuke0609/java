package study;

public class Outer {
	int oField;
	static int oStaticField;
	static class Inner{
		void innerMethod() {
			oStaticField = 10;
		}
	}
	void outerMethod() {
		Inner ic = new Inner();
	}
}
