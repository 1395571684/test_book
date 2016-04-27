package testone;

import java.util.Scanner;

public class TestStuTea {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		Teacher[] tea=new Teacher[2];
		Student[] stu=new Student[4];
		for (int i = 0; i < tea.length; i++) {
			System.out.println("请创建并输入第"+(i+1)+"个老师的基本信息:");
			//System.out.print();
			tea[i]=creatTeacher();
		}
		for (int i = 0; i < stu.length; i++) {
			System.err.println("请创建并输入第"+(i+1)+"个学生的基本信息");
			stu[i]=creatStudent();
			
		}
		tea[0].teach();
		for (int i = 0; i < stu.length; i++) {
			stu[i].learn();
		}
		for (int i = 0; i < stu.length; i++) {
			String tempStr=stu[i].doHomework(20);
			System.out.println(tempStr);
		}
		for (int i=0; i < stu.length; i++) {
			tea[1].checkHomework(stu[i]);
		}
	}
	public static Teacher creatTeacher(){
		Teacher tea=new Teacher();
		System.out.println("请输入老师姓名");
		tea.teaName=input.next();
		
		System.out.println("请输入老师专业");
		tea.teaSpecialty=input.next();
		
		System.out.println("请输入老师讲授的课程");
		tea.teaCourse=input.next();
		
		System.out.println("请输入老师教龄");
		tea.teaYears=input.nextInt();
		return tea;
	}
	public static Student creatStudent(){
		Student stu=new Student();
		System.out.println("请输入学生姓名");
		stu.stuName=input.next();
		
		System.out.println("请输入学生年龄");
		stu.stuAge=input.nextInt();
		
		System.out.println("请输入学生性别");
		stu.stuSex=input.nextInt();
		
		
		System.out.println("请输入学生年级");
		stu.stuGrade=input.nextInt();
		return stu;
	}

}
