package study;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class work1_1 {

	public static void main(String[] args) throws Exception{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		ArrayList<Book> books = new ArrayList<>();
		
		Book b1 = new Book();
		b1.setTitle("Java����");
		b1.setpublishDate(f.parse("2011/10/07"));
		b1.setcomment("�X�b�L���킩��");
		books.add(b1);
		Book b2 = new Book();
		b2.setTitle("Python����");
		b2.setpublishDate(f.parse("2018/06/11"));
		b2.setcomment("�J���[���H�ׂ����Ȃ�");
		books.add(b2);
		Book b3 = new Book();
		b3.setTitle("C�������");
		b3.setpublishDate(f.parse("2018/06/21"));
		b3.setcomment("�|�C���^�����R����");
		books.add(b3);
		
		Collections.sort(books, new titleComparator());
		
		for(Book b : books) {
			System.out.println(b.getTitle() + " " + f.format(b.getPublishDate()) + " " + b.getComment());
		}
	}

}
