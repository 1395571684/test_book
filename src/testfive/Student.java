package testfive;

public class Student {
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;
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
		//无参构造方法
		public Student(){}
		//传入参数name，age，sex，grade的值，输出结果
		public void learn(String name,int age,int sex,int grade){
			String sexStr=(sex==1)?"男生":"女生";
			System.out.println(age+"岁的大学"+grade+"年级"+sexStr+name+"正在认真听课");
		}
		//传入参数name，age，sex的值，grade值取4，输出结果
		public void learn(String name,int age,int sex){
			learn(name,age,sex,4);
		}
		//传入参数name，sex的值，age的值取22，grade值取4，输出结果
		public void learn(String name,int sex){
			learn(name,22,sex,4);
		}
		//无参的听课方法，使用成员变量的值作为参数
		public void learn(){
			learn(this.stuName,this.stuAge,this.stuSex,this.stuGrade);
		}
		public static void main(String[] args) {
			Student stu=new Student("王云",20,1,4);
			stu.learn("刘涛",21,1,3);
			stu.learn("王明", 23, 1);
			stu.learn("马东", 1);
			stu.learn();
		}
}
