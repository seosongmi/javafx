package exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Exam022 {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] { 3, 2, 5, 7, 1 });
		intStream
		.sorted()
		.forEach(n -> System.out.println(n));
		System.out.println();
	}
}

//int[] intArray = {3,2,5,7,1};
//IntStream intstream = Arrays.stream(intArray);
//intStream.forEach(a -> System.out.print(a + ","));
//System.out.println();
//Comparator.reverseOrder()