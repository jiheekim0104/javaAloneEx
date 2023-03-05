package ch17.q8;

public class Member {
	private String name;
	private String job;
	
	public Member(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("{name: ")
				.append(name)
				.append(", job: ")
				.append(job)
				.append("}")
				.toString();
				
	}
	

}
