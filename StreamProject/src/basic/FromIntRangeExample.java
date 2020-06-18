package basic;


import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.*;

public class FromIntRangeExample {
	public static void main(String[] args) {
		IntStream stream = IntStream.range(11,20);
		IntPredicate predicate = new IntPredicate() {

			@Override
			public boolean test(int value) {
				return value % 2 == 1;
			}
		};
	//	stream.filter(predicate).forEach(s -> System.out.println(s));
		
		Random random = new Random();
		IntStream intStream = random.ints(20, 11, 100);
		intStream.filter(t -> t>=50&&t<60).forEach(s -> System.out.println(s));
	}
}
