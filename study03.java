package study;

import java.util.ArrayList;
import java.util.List;

public class study03 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		List<Hero2> list = new ArrayList<>();
		Hero2 h1 = new Hero2();
		h1.name = "�~���M";
		list.add(h1);
		System.out.println("�v�f��=" + list.size());
		h1 = new Hero2();
		list.remove(h1);
		System.out.println("�v�f��=" + list.size());
	}

}
