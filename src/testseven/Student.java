//单例模式示范
package testseven;

public class Student {
	String stuName;
	static Student stu=new Student("王云");
	private Student (String name) {
		stuName=name;
		System.out.println("学生的姓名为"+stuName);
			}
	public static Student get(){
		return stu;
	}

}
