//单例模式示范
package testseven;

public class Student {
	String stuName;
	static Student stu=new Student("王云");//static保证只能有一个实例
	//构造方法私有化
	private Student (String name) {
		stuName=name;
		System.out.println("学生的姓名为"+stuName);
			}
	//静态公有方法返回类对象
	public static Student get(){
		return stu;
	}

}
