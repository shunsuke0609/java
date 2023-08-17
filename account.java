package study;

public class account {
	String accountNo;
	
	public boolean equals(Object o) {
		if(o == this) return true;
		if (o == null) return false;
		if(!(o instanceof account)) return false;
		account m = (account)o;
		if(!this.accountNo.trim().equals(m.accountNo.trim())) {
			return false;
		}
		return true;
	}
}
