package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

import intermediate.Students;

public class AggregateExample2 {
	public static void main(String[] args) {
		List<Students> students = Arrays.asList(
				new Students("Hong",55), 
				new Students("Hwang", 67),
				new Students("Park", 88)
		);
		int result = students.stream().mapToInt(new ToIntFunction<Students>() {
			@Override
			public int applyAsInt(Students value) {
				return value.getScore();
			}
		}).sum();
		System.out.println("집계결과1:" + result);
		
		result = students.stream().filter(n -> n.getScore() > 100)
				.mapToInt(s -> s.getScore())
			.reduce(new IntBinaryOperator() {

				@Override
				public int applyAsInt(int left, int right) {
					System.out.println("left:" + left + ", right: " + right);
					return left + right;
				}
			}).getAsInt();
		System.out.println("집계결과2:" + result);
		
		result = students.stream().filter(n -> n.getScore() > 100)
				.mapToInt(s -> s.getScore())
				.reduce(0, new IntBinaryOperator() {
					
					@Override
					public int applyAsInt(int left, int right) {
						// TODO Auto-generated method stub
						return left + right;
					}
				});
		System.out.println("집계결과3:" + result);
		
	} //end of main
}
