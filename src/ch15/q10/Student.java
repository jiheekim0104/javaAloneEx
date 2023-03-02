package ch15.q10;

public class Student implements Comparable<Student>{
	public String id;
	public int score;
	public Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	

	@Override
	public int compareTo(Student student) {
		if(score<student.score) return -1;
		else if (score==student.score) return 0;
		else return 1;
	}
	
}
