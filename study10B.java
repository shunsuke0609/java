package study;

public class study10B {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Hero5B h5b = new Hero5B("�~�i�g");
		SwordB sb = new SwordB("�͂��˂̌�");
		
		h5b.setSwordB(sb);
		System.out.println("�����F" + h5b.getSwordB().getName());
		System.out.println("clone()�ŕ������܂��B");
		Hero5B h6b = h5b.clone();
		
		System.out.println("�R�s�[���̗E�҂̌��̖��O��ς��܂�");
		h5b.getSwordB().setName("�Ђ̂��̖_");
		System.out.println("�R�s�[���ƃR�s�[��̗E�҂̑�����\�����܂��B");
		System.out.println("�R�s�[���F" + h5b.getSwordB().getName() + "/�R�s�[��F" + h6b.getSwordB().getName());
	}

}
