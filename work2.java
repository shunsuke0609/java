package study;

public class work2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		StrongBox<String> sb=new StrongBox<>(KeyType.PADLOCK);
		sb.put("�����J���܂���");
		String rock="";
		for(int i=0; i<1024; i++) {
			rock=sb.get();
		}
		if(rock!=null) {
			System.out.println(rock);
		}else {
			System.out.println("���͊J���Ă��܂���");
		}
	}

}
