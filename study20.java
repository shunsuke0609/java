package study;

import java.util.Optional;

public class study20 {
	public static Optional<String> decorate(String s, char c){
		String r;
		if(s == null || s.length() == 0) {
			r = null;
		}else {
			r = c + s + c;
		}
		return Optional.ofNullable(r);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Optional<String> s = decorate("", '*');
		System.out.println(s.orElse("nullのため処理できません"));
	}

}
