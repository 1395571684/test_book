package testfour;

public class Student {
	private String stuName = "";
	private int stuAge = -1;
	private int stuSex = -1;
	private int stuGrade = -1;


	// 使用初始化块初始化
	{
		System.out.println("正在使用初始化块");
		stuName = "李雷";
		stuAge = 20;
		stuSex = 1;
		stuGrade = 4;
	}

	public Student() {// 无参构造方法
		System.out.println("正在使用无参构造方法");
	}

	// 使用构造方法，用户初始化对象成员变量
	public Student(String name, int age, int sex, int grade) {
		System.out.println("正在使用有参构造函数初始化");
		stuName = name;
		stuAge = age;
		stuSex = sex;
		stuGrade = grade;
	}
	public String getStuName() {
		return stuName;
	}

	public int getStuAge() {
		return stuAge;
	}

	public int getStuSex() {
		return stuSex;
	}

	public int getStuGrade() {
		return stuGrade;
	}

}
