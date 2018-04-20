package com.sachin.cloning;

import java.util.stream.Stream;

public class Degree implements Cloneable{

	private String school;
	private String college;
	private String stream;
	
	
	public Degree(String school, String college, String stream) {
		super();
		this.school = school;
		this.college = college;
		this.stream = stream;
	}
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "Degree [school=" + school + ", college=" + college + ", stream=" + stream + "]";
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
