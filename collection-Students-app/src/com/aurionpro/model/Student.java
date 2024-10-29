package com.aurionpro.model;

public class Student  {// need for treeSet
	private String studentName;
	private int rollNo;
	private double marks;

	public Student(String studentName, int rollNo, double marks) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}

	@Override // need for set
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}

	@Override // need for set
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}

	public int compareTo(Student other) {
	    // First, compare by name
	    int nameComparison = this.studentName.compareTo(other.studentName);
	    
	    // If names are equal, compare by roll number
	    if (nameComparison == 0) {
	        return Integer.compare(this.rollNo, other.rollNo);
	    }
	    
	    return nameComparison;
	}

}
