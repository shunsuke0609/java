package study;

public class Account2 implements Comparable<Account2>{
	int number;
	int zandaka;
	
	public int compareTo(Account2 obj) {
		if(this.number < obj.number) {
			return -1;
		}
		if(this.number > obj.number) {
			return 1;
		}
		return 0;
	}
}
