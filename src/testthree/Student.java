package testthree;

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
	public int getStuAge() {
		return stuAge;
	}
	
	public int getStuSex() {
		return stuSex;
	}
	
	public int getStuGrade() {
		return stuGrade;
	}

	//构造方法，用户初始化对象属性
	public Student(String stuName, int stuAge, int stuSex, int stuGrade) {
		super();
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
		this.stuGrade = stuGrade;
	}
	//构造方法，用户初始化对象属性（不带年级参数，设置年级参数默认值为4）
	public Student(String stuName, int stuAge, int stuSex) {
		super();
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
		this.stuGrade=4;
	}
	//构造方法，用户初始化对象属性（不带年龄，年级参数表，设置年龄参数默认值为22，年级参数默认值为4）
	public Student(String stuName, int stuSex) {
		super();
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuAge=22;
		this.stuGrade=4;
	}
	

}
