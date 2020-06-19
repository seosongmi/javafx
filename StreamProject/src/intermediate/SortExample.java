package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {
		List<Students> students = Arrays.asList( //
				new Students("Hong", 30), //
				new Students("Park", 15), //
				new Students("Hwang", 25) //
		);
		students.stream().sorted().forEach(s -> System.out.println(s));
		List<Person> persons = Arrays.asList(//
				new Person("Hong", 30), //
				new Person("Park", 15), //
				new Person("Hwang", 25) //
				
				);
		persons.stream().sorted(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.age - o2.age;
			}
		}).forEach(System.out::println);
	}
}
