package testnine;

public class Student {
	public static String staticString="静态变量";//静态变量
	private String stuName="";//学生姓名，私有变量
	static{
		System.out.println("*************使用静态块初始化*************");
		System.out.println("静态块里使用的静态变量值为："+staticString);
	}
	{
		stuName="雷静";
		System.out.println("*************使用初始化块初始化*************");
		System.out.println("初始化块里使用的静态变量值为："+staticString);
		System.out.println("初始化块里显示的实例变量值为："+stuName);
	}
	Student(String str){
		stuName=str;
		System.out.println("*************使用构造函数初始化*************");
		System.out.println("构造函数里使用的静态变量值为："+staticString);
		System.out.println("构造函数里显示的实例变量值为："+stuName);
	}
	public void sysStatic(){
		System.out.println("静态变量的值为："+staticString);
	}
	public static void main(String[] args) {
		Student stu=new Student("王云");
		stu.staticString="改动过的静态变量";
		stu.sysStatic();
		System.out.println("王云的静态变量为："+stu.staticString);
		Student stu1=new Student("李红");
		stu.staticString="再次被改动的静态变量";
		stu.sysStatic();
		System.out.println("王云的静态变量为："+stu.staticString);
	}
	
}

