package study;

import java.util.*;

public class study25 {

	public static void main(String[] args) {
		List<Account7> list = new ArrayList<>();
			
		Account7 a1 = new Account7("1732050", AccountType1.FUTSU);
		Account7 a2 = new Account7("1732051", AccountType1.FUTSU);
		a1.zandaka = 500000;
		a2.zandaka = 100000;
		list.add(a1);
		list.add(a2);
		System.out.println("口座番号" + list.get(0).accountNo + "の残高は" + list.get(0).zandaka + "です");
		System.out.println("口座番号" + list.get(1).accountNo + "の残高は" + list.get(1).zandaka + "です");
		System.out.println("listの並びは");
		for(Account7 a : list) {
			System.out.println(a.accountNo);
		}
		
		Collections.sort(list, (x, y) -> (x.zandaka - y.zandaka));
		
		System.out.println("ソート後のlistの並びは");
		for(Account7 a : list) {
			System.out.println(a.accountNo);
		}
	}

}
