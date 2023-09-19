package study;

public class Account6 {
	private String accountNo;
	private int zandaka;
	private accountType accountType;
	public Account6(String aNo, accountType aType) {
		this.accountNo = aNo;
		this.accountType = aType;
	}
	
	public String getAccountNo() {
		return this.accountNo;
	}
	public int getZandaka() {
		return this.zandaka;
	}
	public void setZandaka(int zandaka) {
		this.zandaka = zandaka;
	}
	public accountType getAccountType() {
		return accountType;
	}
}
