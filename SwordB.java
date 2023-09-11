package study;

public class SwordB implements Cloneable{
	private String name;
	
	public SwordB clone() {
		SwordB result = new SwordB();
		result.name = this.name;
		return result;
	}
	
	public SwordB() {
		this.name = "";
	}
	public SwordB(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
