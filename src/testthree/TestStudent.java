package testthree;

public class TestStudent {
	public static void main(String[] args) {
		Student wang=new Student("王云",22,2,4);
		Student liu=new Student("刘静",22,2);
		Student li=new Student("李博涛",1);
		wang.learn();
		String str=wang.doHomework(20);
		System.out.println(str);
		liu.learn();
		System.out.println(liu.getStuName()+"正在读大学"+liu.getStuGrade()+"年级");
		System.out.println(li.doHomework(23));
	}

}
