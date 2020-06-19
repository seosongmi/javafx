package intermediate;
// 6/19
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class MappingExample2 {
	public static void main(String[] args) {
		List<Employee> employees = Employee.persons();
		
//		employees.stream()
//		.map(t -> t.getName())
//		.filter(t -> t.startsWith("H")) 
//		.forEach(s -> System.out.println(s));
//		
		employees.stream()
		.map(t -> t.getName())
		.flatMap(t -> IntStream.range(0, t.length())
					  .mapToObj(value -> t.charAt(value)))
			.forEach(s -> System.out.println(s));
		
	}
}
