package study;

public class Outer2 {
	int oMember = 2;
	void outerMethod() {
		int a = 10;
		class Inner{
			public void innerMethod() {
				System.out.println("innerMethod‚Å‚·B");
				System.out.println(oMember + a);
			}
		}
		Inner ic = new Inner();
		ic.innerMethod();
	}
}
