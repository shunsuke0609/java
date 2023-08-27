package study;

import java.util.*;

public class study05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<Hero3> list = new HashSet<>();
		Hero3 h3 = new Hero3();
		h3.name = "マツムラ";
		list.add(h3);
		System.out.println("要素数＝" + list.size());
		h3 = new Hero3();
		h3.name = "マツムラ";
		list.remove(h3);
		System.out.println("要素数＝" + list.size());
	}

}
