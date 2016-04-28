package testfour;

public class TestStudent {
      public static void main(String[] args) {
		Student stu1=new Student();
		System.out.println(stu1.getStuName()+"正在读大学"+stu1.getStuGrade()+"年级");
		Student stu2= new Student("李红",22,2, 3);
		System.out.println(stu2.getStuName()+"正在读大学"+stu2.getStuGrade()+"年级");
      }
}
