package study;

public class study02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		account a1 = new account();
		a1.accountNo = "009";
		System.out.println(a1.equals(a1));
		System.out.println(a1.equals(null));
		String s1 = "";
		System.out.println(a1.equals(s1));
		account a2 = new account();
		a2.accountNo = "018";
		System.out.println(a1.equals(a2));
		a2.accountNo = "  009";
		System.out.println(a1.equals(a2));
	}

}
