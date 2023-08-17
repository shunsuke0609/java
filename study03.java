package study;

import java.util.ArrayList;
import java.util.List;

public class study03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Hero2> list = new ArrayList<>();
		Hero2 h1 = new Hero2();
		h1.name = "ミヤギ";
		list.add(h1);
		System.out.println("要素数=" + list.size());
		h1 = new Hero2();
		list.remove(h1);
		System.out.println("要素数=" + list.size());
	}

}
