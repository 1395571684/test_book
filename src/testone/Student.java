package testone;

public class Student {
	String stuName;
	int stuAge;
	int stuSex;
	int stuGrade;
	public void learn(){
		System.err.println(stuName+"正在认真听课!");
	}
	public String doHomework(int hour){
		return "现在是北京时间"+hour+"点，"+stuName+"正在写作业！";
	}

}
