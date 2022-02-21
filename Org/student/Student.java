package Org.student;

import Org.department.Department;

public class Student extends Department{
	public void StudentName() {
		System.out.println("jamal");
		
	}
	public void StudentDept() {
		System.out.println("CivilEngineering");
		
	}
	public void StudentId() {
		System.out.println(213);
}
	public static void main(String[] args) {
		Student stu = new Student();
		stu.CollegeName();
		stu.CollegeRank();
		stu.CollegeCode();
		stu.DeptName();
		stu.StudentName();
		stu.StudentDept();
		stu.StudentId();
	}

}
