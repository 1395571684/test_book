package testfour;

public class Student {
	private String stuName = "";
	private int stuAge = -1;
	private int stuSex = -1;
	private int stuGrade = -1;


	// ʹ�ó�ʼ�����ʼ��
	{
		System.out.println("����ʹ�ó�ʼ����");
		stuName = "����";
		stuAge = 20;
		stuSex = 1;
		stuGrade = 4;
	}

	public Student() {// �޲ι��췽��
		System.out.println("����ʹ���޲ι��췽��");
	}

	// ʹ�ù��췽�����û���ʼ�������Ա����
	public Student(String name, int age, int sex, int grade) {
		System.out.println("����ʹ���вι��캯����ʼ��");
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
