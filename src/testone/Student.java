package testone;

public class Student {
	String stuName;
	int stuAge;
	int stuSex;
	int stuGrade;
	public void learn(){
		System.err.println(stuName+"������������!");
	}
	public String doHomework(int hour){
		return "�����Ǳ���ʱ��"+hour+"�㣬"+stuName+"����д��ҵ��";
	}

}
