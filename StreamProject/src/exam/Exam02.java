package exam;

import java.util.Arrays;

public class Exam02 {
	public static void main(String[] args) {
		int[] intAry = new int[] { 3, 2, 5, 7, 1 };
		Arrays.sort(intAry, 0, intAry.length);
		for (int i : intAry) {
			System.out.println(i + " ");
		}
	}
	
	
}
