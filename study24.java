package study;

import java.util.function.Function;

public class study24 {

	public static void main(String[] args) {
		Function<String, Integer> func = (String s) -> { return s.length(); };
		int n = func.apply("JavaScript");
		System.out.println("文字列「JavaScript]は" + n + "文字です");

	}

}
