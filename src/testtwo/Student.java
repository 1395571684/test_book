package testtwo;

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
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public int getStuSex() {
		return stuSex;
	}
	public void setStuSex(int stuSex) {
		this.stuSex = stuSex;
	}
	public int getStuGrade() {
		return stuGrade;
	}
	public void setStuGrade(int stuGrade) {
		this.stuGrade = stuGrade;
	}

}
