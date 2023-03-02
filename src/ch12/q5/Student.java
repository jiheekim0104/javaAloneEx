package ch12.q5;

public class Student {
	private String studentNum;

	public String getStudentNum() {
		return studentNum;
	}

	public Student(String studentNum) {
		super();
		this.studentNum = studentNum;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			Student student = (Student)obj;
			return studentNum.equals(student.studentNum);
		}
		return false;
	}
	
	
}
