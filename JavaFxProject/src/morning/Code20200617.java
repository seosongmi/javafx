package morning;

public class Code20200617 {
	public static void main(String[] args) {
		int[] intAry = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int temp = 0;
		
		for(int i = 0; i<intAry.length; i++) {
			for(int j = 0; i<intAry.length; i++) {
				if (intAry[i] <intAry[j]) {
					temp = intAry[i];
					intAry[i] = intAry[j];
					intAry[j] = temp;
				}
			}
		}
		
		for (int i : intAry) {
			System.out.print(i);
		}


	}

}
