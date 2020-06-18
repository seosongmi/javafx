package intermediate;
//p.801실습 (6/18)
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class FlatMapExample {
	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lamda", "stream mapping");
		inputList1.stream()
		.flatMap(new Function<String,Stream<String>>(){

			@Override
			public Stream<String> apply(String t) {
				// TODO Auto-generated method stub
				return Arrays.stream(t.split(" "));
			}
			
		})
				//-> Arrays.stream(data.split("")))
		.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		List<String> inputList2 = Arrays.asList("10,20,30","40,50,60");
		inputList2.stream()
			.flatMapToInt(new Function<String,IntStream>() {

				@Override
				public IntStream apply(String t) {
					String[] strAry = t.split(",");
					int[] intArr = new int[strAry.length];
					for(int i = 0; i<strAry.length; i++) {
						intAry[i] = Integer.parseInt(strAry[i].trim());
					}
					return Arrays.stream(intAry);
				}
	

			})
			.forEach(System.out::println);
					//number -> System.out.println(number));
	}
}
