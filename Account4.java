package study;

public class Account4 {
	private String accountNo;
	private int zandaka;
	private String accountType;
	public Account4(String aNo, String aType) {
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
	public String getAccountType() {
		return this.accountType;
	}
}
