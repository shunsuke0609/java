package study;

public class study10B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero5B h5b = new Hero5B("ミナト");
		SwordB sb = new SwordB("はがねの剣");
		
		h5b.setSwordB(sb);
		System.out.println("装備：" + h5b.getSwordB().getName());
		System.out.println("clone()で複製します。");
		Hero5B h6b = h5b.clone();
		
		System.out.println("コピー元の勇者の剣の名前を変えます");
		h5b.getSwordB().setName("ひのきの棒");
		System.out.println("コピー元とコピー先の勇者の装備を表示します。");
		System.out.println("コピー元：" + h5b.getSwordB().getName() + "/コピー先：" + h6b.getSwordB().getName());
	}

}
