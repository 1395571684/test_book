//����ģʽʾ��
package testseven;

public class Student {
	String stuName;
	static Student stu=new Student("����");
	private Student (String name) {
		stuName=name;
		System.out.println("ѧ��������Ϊ"+stuName);
			}
	public static Student get(){
		return stu;
	}

}
