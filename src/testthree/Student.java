package testthree;

public class Student {
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;
	
	public void learn(){
		System.err.println(stuName+"������������!");
	}
	public String doHomework(int hour){
		return "�����Ǳ���ʱ��"+hour+"�㣬"+stuName+"����д��ҵ��";
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

	//���췽�����û���ʼ����������
	public Student(String stuName, int stuAge, int stuSex, int stuGrade) {
		super();
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
		this.stuGrade = stuGrade;
	}
	//���췽�����û���ʼ���������ԣ������꼶�����������꼶����Ĭ��ֵΪ4��
	public Student(String stuName, int stuAge, int stuSex) {
		super();
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
		this.stuGrade=4;
	}
	//���췽�����û���ʼ���������ԣ��������䣬�꼶�����������������Ĭ��ֵΪ22���꼶����Ĭ��ֵΪ4��
	public Student(String stuName, int stuSex) {
		super();
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuAge=22;
		this.stuGrade=4;
	}
	

}
