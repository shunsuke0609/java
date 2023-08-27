package study;

public class Hero3 {
	public String name;
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null) return false;
		if(!(o instanceof Hero3)) return false;
		Hero3 h = (Hero3) o;
		if(!this.name.trim().equals(h.name.trim())) {
			return false;
		}
		return true;
	}
}
