package intermediate;

//p.718 6/19
import java.util.function.IntBinaryOperator;

public class LambdaExample2 {
	private static int[] scores = { 10, 50, 3 };

	private static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값얻기
		int max = maxOrMin(
				(a, b) -> {
			if (a >= b)	return a;
			else return b;
		}
	);
		System.out.println("최대값: " + max);

		// 최소값 얻기
		int min = maxOrMin(
				(a, b) -> {
			if (a <= b) return a;
			else return b;
		}
	);
		System.out.println("최소값:" + min);
	}
}
