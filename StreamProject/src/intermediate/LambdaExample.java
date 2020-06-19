package intermediate;
//답안
import java.util.function.ToIntFunction;

class Student {
	private String name;
	private int englishScore;
	private int mathScore;

	public Student(String name, int englishScore, int mathScore) {
		super();
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}
}

public class LambdaExample {
	private static Student[] students = { //
			new Student("Hong", 90, 96), //
			new Student("Hwang", 95, 93) //
	};

	public static double avgTotal() {
		int sum = 0;
		for (Student student : students) {
			sum += student.getEnglishScore() + student.getMathScore();
		}
		return (double) sum / students.length;
	}

	public static double avgEnglish() {
		int sum = 0;
		for (Student student : students) {
			sum += student.getEnglishScore();
		}
		return (double) sum / students.length;
	}

	public static double avgMath() {
		int sum = 0;
		for (Student student : students) {
			sum += student.getMathScore();
		}
		return (double) sum / students.length;
	}

	public static double avg(ToIntFunction<Student> toIntFunction) {
		int sum = 0;
		for (Student student : students) {
			sum += toIntFunction.applyAsInt(student);
		}
		return (double) sum / students.length;
	}

	public static void main(String[] args) {

		System.out.println("수학평균:" + avgMath());

		System.out.println("영어평균:" + avgEnglish());

		System.out.println("전체평균:" + avgTotal());

		double englishAvg = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getEnglishScore();
			}
		});
		System.out.println("영어 평균 점수: " + englishAvg);

		double mathAvg = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getMathScore();
			}
		});
		System.out.println("수학 평균 점수: " + mathAvg);
		double TotalAvg = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getMathScore() + value.getEnglishScore();
			}
		});

		System.out.println("전체 평균 점수: " + TotalAvg);
	}
}
