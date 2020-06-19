package intermediate;

public class Students implements Comparable<Students>{
	private String name;
	private int score;
	public Students(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	@Override
	public String toString() {
		String str = String.format("%s %s", name, score);
		return str;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.score;
	}

	@Override
	public boolean equals(Object obj) {
		Students std = (Students) obj;
		boolean stdBool = this.name.equals(std.name);
		boolean scoreBool = this.score == std.score;
		return stdBool && scoreBool;
	}
	@Override
	public int compareTo(Students o) {
		// -1(음수) 오름차순
		// 1(양수) 내림차순 
		// 0
//		return this.score - o.score;
		return this.name.compareTo(o.name);
	}
}
