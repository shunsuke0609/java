package study;

public class study10 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Hero5 h5 = new Hero5("�~�i�g");
		Sword s = new Sword("�͂��˂̌�");
		
		h5.setSword(s);
		System.out.println("����" + h5.getSword().getName());
		System.out.println("clone()�ŕ������܂��B");
		Hero5 h6 = h5.clone();
		
		System.out.println("�R�s�[���̗E�҂̌��̖��O��ς��܂�");
		h5.getSword().setName("�Ђ̂��̖_");
		System.out.println("�R�s�[���ƃR�s�[��̗E�҂̑�����\�����܂��B");
		System.out.println("�R�s�[���F" + h5.getSword().getName() + "/�R�s�[��F" + h6.getSword().getName());
	}

}
