package study;

public class Account5 {
	private String accountNo;
	private int zandaka;
	private int accountType;
	public Account5(String aNo, int aType) {
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
		String tmpAccountType = "";
		if(this.accountType == 1) {
			tmpAccountType = "•’Ê";
		}
		else if(this.accountType ==  2) {
			tmpAccountType = "“–À";
		}
		else if(this.accountType == 3) {
			tmpAccountType = "’èŠú";
		}
		return tmpAccountType;
	}
	
	public static final int FUTSU = 1; 
	public static final int TOUZA = 2; 
}
