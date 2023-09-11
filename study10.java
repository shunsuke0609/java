package study;

public class study10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero5 h5 = new Hero5("ミナト");
		Sword s = new Sword("はがねの剣");
		
		h5.setSword(s);
		System.out.println("装備" + h5.getSword().getName());
		System.out.println("clone()で複製します。");
		Hero5 h6 = h5.clone();
		
		System.out.println("コピー元の勇者の剣の名前を変えます");
		h5.getSword().setName("ひのきの棒");
		System.out.println("コピー元とコピー先の勇者の装備を表示します。");
		System.out.println("コピー元：" + h5.getSword().getName() + "/コピー先：" + h6.getSword().getName());
	}

}
