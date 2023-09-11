package study;

public class Hero5B implements Cloneable{
	String name;
	int hp;
	SwordB sword;
	
	public Hero5B clone() {
		Hero5B result = new Hero5B();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;
		return result;
	}
	
	public Hero5B() {
		this.name = "";
	}
	public Hero5B(String name) {
		this.name = name;
	}
	public SwordB getSwordB() {
		return this.sword;
	}
	public void setSwordB(SwordB sword) {
		this.sword = sword;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
