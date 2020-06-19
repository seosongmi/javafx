package intermediate;
//p.718 6/19
import java.util.function.ToIntFunction;

public class LamdaExample {
	private static Student[] students = {
		new Student("홍길동", 90, 96),
		new Student("신용권", 95, 93)
	};
	
	public static double avgTotal() {
		return 0;
		
	}
	
	public static double avgEnglish() {
		return 0;
	}
	
	public static double avgMath() {
		return 0;
	}
	
	public static double avg( ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : students) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / students.length;
		return avg;
	}
	//avg() 메소드 작성
	
	public static void main(String[] args) {
		System.out.println("영어 평균 점수: " + avgEnglish());
		
		System.out.println("수학 평균 점수: " + avgMath());
		
		System.out.println("전체평균:" + avgTotal());
		
		System.out.println("수학평균점수: " +  mathAvg);
		double TotalAvg = 0;
		
		System.out.println("전체평균점수: " + TotalAvg);
		
	}
	
	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;
		
	public Student(String name, int englishScore, int mathScore) {
		this.name =  name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public String getName() { return name; }
	public int getEnglishScore() { return englishScore; }
	public int getMathScore() { return mathScore; }
	
	}
}
