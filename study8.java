package study;

import java.util.*;

public class study8 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		List<Account2> list = new ArrayList<>();
		Account2 a21 = new Account2();
		Account2 a22 = new Account2();
		a21.number = 200;
		a22.number = 100;
		list.add(a21);
		list.add(a22);
		System.out.println("�\�[�g�O�F");
		for(Account2 a : list) {
			System.out.println(a.number);
		}
		
		Collections.sort(list);
		
		System.out.println("�\�[�g��F");
		for(Account2 a : list) {
			System.out.println(a.number);
		}
	}

}
