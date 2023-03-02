package ch13.q3;

public class Container<T1, T2> {
	public T1 name;
	public T2 job;
	public T2 age;
	
	public T1 getName() {
		return this.name;
	}
	
	public void setNameJob(T1 name,T2 job) {
		this.name = name;
		this.job = job;
	}

	public T2 getJob() {
		return this.job;
	}

	public T2 getAge() {
		return this.age;
	}

	public void setNameAge(T1 name,T2 age) {
		this.name = name;
		this.age = age;
	}

	
	
	
  }
