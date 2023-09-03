package study;

import java.util.Objects;

public class Hero4 {
	String name;
	int hp;
	
	public int hashCode() {
		return Objects.hash(this.name, this.hp);
	}
}
