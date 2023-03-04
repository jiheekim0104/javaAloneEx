package ch18;

import java.io.Serializable;

public class Member implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1616065040391964919L;
	//private static final long serialVersionUID = -622284561026719240L;
	private String id;
	private String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+":"+name;
	}
	
	
	
}
