package testone;

import java.util.Scanner;

public class TestStuTea {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		Teacher[] tea=new Teacher[2];
		Student[] stu=new Student[4];
		for (int i = 0; i < tea.length; i++) {
			System.out.println("�봴���������"+(i+1)+"����ʦ�Ļ�����Ϣ:");
			//System.out.print();
			tea[i]=creatTeacher();
		}
		for (int i = 0; i < stu.length; i++) {
			System.err.println("�봴���������"+(i+1)+"��ѧ���Ļ�����Ϣ");
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
		System.out.println("��������ʦ����");
		tea.teaName=input.next();
		
		System.out.println("��������ʦרҵ");
		tea.teaSpecialty=input.next();
		
		System.out.println("��������ʦ���ڵĿγ�");
		tea.teaCourse=input.next();
		
		System.out.println("��������ʦ����");
		tea.teaYears=input.nextInt();
		return tea;
	}
	public static Student creatStudent(){
		Student stu=new Student();
		System.out.println("������ѧ������");
		stu.stuName=input.next();
		
		System.out.println("������ѧ������");
		stu.stuAge=input.nextInt();
		
		System.out.println("������ѧ���Ա�");
		stu.stuSex=input.nextInt();
		
		
		System.out.println("������ѧ���꼶");
		stu.stuGrade=input.nextInt();
		return stu;
	}

}
