package testthree;

public class TestStudent {
	public static void main(String[] args) {
		Student wang=new Student("����",22,2,4);
		Student liu=new Student("����",22,2);
		Student li=new Student("���",1);
		wang.learn();
		String str=wang.doHomework(20);
		System.out.println(str);
		liu.learn();
		System.out.println(liu.getStuName()+"���ڶ���ѧ"+liu.getStuGrade()+"�꼶");
		System.out.println(li.doHomework(23));
	}

}
