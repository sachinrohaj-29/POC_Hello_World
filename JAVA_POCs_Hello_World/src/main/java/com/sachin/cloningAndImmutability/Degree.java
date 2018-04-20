package com.sachin.cloningAndImmutability;

public class Degree {

	private String subject1;	 
    private String subject2; 
    private String subject3;
 
    
    public String getSubject1() {
		return subject1;
	}
	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}
	public String getSubject2() {
		return subject2;
	}
	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
	public String getSubject3() {
		return subject3;
	}
	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}
	
	public Degree(String sub1, String sub2, String sub3)
    {
        this.subject1 = sub1; 
        this.subject2 = sub2; 
        this.subject3 = sub3;
    }
	
	public String toString(){
		return subject1 + " " + subject2 + " " + subject3;
	}
	/*public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}*/
}
