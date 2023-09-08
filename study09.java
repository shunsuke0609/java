package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class study09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Account3> list = new ArrayList<>();
		Account3 a31 = new Account3();
		Account3 a32 = new Account3();
		Account3 a33 = new Account3();
		
		a31.number = 200;
		a32.number = 100;
		a33.number = 300;
		a31.zandaka = 1000000;
		a32.zandaka = 500000;
		a33.zandaka = 100000;
		list.add(a31);
		list.add(a32);
		list.add(a33);
		
		System.out.println("ソート前：");
		for(Account3 a : list) {
			System.out.println(a.number);
		}
		
		Collections.sort(list);
		
		System.out.println("自然順序でのソート後：");
		for(Account3 a : list) {
			System.out.println(a.number);
		}
		
		Collections.sort(list, new ZandakaComparator());
		
		System.out.println("残高順でのソート後：");
		for(Account3 a : list) {
			System.out.println(a.number);
		}
	}

}
