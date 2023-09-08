package study;

public class Account1 {
	String accountNo;
	
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null) return false;
		if(!(o instanceof Account1)) return true;
		Account1 r = (Account1) o;
		if(!this.accountNo.trim().equals(r.accountNo.trim())) {
			return false;
		}
		return true;
	}
}
