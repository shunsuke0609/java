package study;

public class Account3 implements Comparable<Account3>{
	int number;
	int zandaka;
	
	public int compareTo(Account3 obj) {
		if(this.number < obj.number) {
			return -1;
		}
		if(this.number > obj.number) {
			return 1;
		}
		return 0;
	}
}
