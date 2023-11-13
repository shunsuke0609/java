package study;

import java.util.function.Function;

public class study24 {

	public static void main(String[] args) {
		Function<String, Integer> func = (String s) -> { return s.length(); };
		int n = func.apply("JavaScript");
		System.out.println("•¶š—ñuJavaScript]‚Í" + n + "•¶š‚Å‚·");

	}

}
