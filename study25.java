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
		System.out.println("�����ԍ�" + list.get(0).accountNo + "�̎c����" + list.get(0).zandaka + "�ł�");
		System.out.println("�����ԍ�" + list.get(1).accountNo + "�̎c����" + list.get(1).zandaka + "�ł�");
		System.out.println("list�̕��т�");
		for(Account7 a : list) {
			System.out.println(a.accountNo);
		}
		
		Collections.sort(list, (x, y) -> (x.zandaka - y.zandaka));
		
		System.out.println("�\�[�g���list�̕��т�");
		for(Account7 a : list) {
			System.out.println(a.accountNo);
		}
	}

}
