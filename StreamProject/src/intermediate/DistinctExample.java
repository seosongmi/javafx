package intermediate;
//6/18
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class DistinctExample {
	public static void main(String[] args) {
		IntStream is = IntStream.of(1, 2, 2, 3, 3, 5, 6, 5);
//		int sum = 0;
//		sum = is.distinct().peek(System.out::println).sum();
//		System.out.println("sum:" + sum);

		List<Students> list = Arrays.asList(new Students("Hong", 33), new Students("Hong", 33), new Students("Hwang", 37),
				new Students("Park", 44));
		list.stream().distinct().forEach(s -> System.out.println(s));
	}

	
}
