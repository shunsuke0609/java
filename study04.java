package study;

import java.util.Arrays;

public class study04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 3};
		System.out.println("誤った判定："+a.equals(b));
		System.out.println("正しい判定："+Arrays.equals(a, b));
	}

}
