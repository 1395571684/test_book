package testfour;

public class TestStudent {
      public static void main(String[] args) {
		Student stu1=new Student();
		System.out.println(stu1.getStuName()+"���ڶ���ѧ"+stu1.getStuGrade()+"�꼶");
		Student stu2= new Student("���",22,2, 3);
		System.out.println(stu2.getStuName()+"���ڶ���ѧ"+stu2.getStuGrade()+"�꼶");
      }
}
