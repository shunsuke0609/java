package study;

public class work2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StrongBox<String> sb=new StrongBox<>(KeyType.PADLOCK);
		sb.put("鍵が開きました");
		String rock="";
		for(int i=0; i<1024; i++) {
			rock=sb.get();
		}
		if(rock!=null) {
			System.out.println(rock);
		}else {
			System.out.println("鍵は開いていません");
		}
	}

}
