package study;

import java.util.*;

public class study05 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Set<Hero3> list = new HashSet<>();
		Hero3 h3 = new Hero3();
		h3.name = "�}�c����";
		list.add(h3);
		System.out.println("�v�f����" + list.size());
		h3 = new Hero3();
		h3.name = "�}�c����";
		list.remove(h3);
		System.out.println("�v�f����" + list.size());
	}

}
