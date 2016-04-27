package testtwo;

public class Student {
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;
	public void learn(){
		System.err.println(stuName+"正在认真听课!");
	}
	public String doHomework(int hour){
		return "现在是北京时间"+hour+"点，"+stuName+"正在写作业！";
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
