package study;

public class Hero5 {
	String name;
	int hp;
	Sword sword;
	
	public Hero5 clone() {
		Hero5 result = new Hero5();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;
		return result;
	}
	
	public Hero5() {
		this.name = "";
	}
	public Hero5(String name) {
		this.name = name;
	}
	public Sword getSword() {
		return this.sword;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
