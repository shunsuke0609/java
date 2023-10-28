package study;

import java.util.function.*;

public class study22 {
	public static Integer len(String s) {
	    return s.length();
	  }
	  public static void main(String[] args) {
	    Function<String, Integer> func = study22::len;
	    int a = func.apply("Java");
	    System.out.println("•¶š—ñuJavav‚Í" + a + "•¶š‚Å‚·");
	  }
}
