package study;

import java.util.*;

public class study23 {
	public static void partyInfo(Set<Hero7> party, Hero7 leader, String pName) {
		System.out.println(pName+"�p�[�e�B�[�̃��[�_�[��" + leader.getName());
		System.out.print("�p�[�e�B�[�����o�[��");
		for(Hero7 h:party) {
			System.out.print(h.getName()+" ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Hero7 h1=new Hero7("�~�i�g");
		Hero7 h2=new Hero7("�A�T�J");
		Hero7 h3=new Hero7("�X�K����");
		Set<Hero7> party=new HashSet<>();
		party.add(h1);
		party.add(h2);
		party.add(h3);
		PartyInfoConsumer func = study23::partyInfo;
		func.process(party, h1, "�X�b�L��");
	}

}
