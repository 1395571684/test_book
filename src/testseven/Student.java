//����ģʽʾ��
package testseven;

public class Student {
	String stuName;
	static Student stu=new Student("����");//static��ֻ֤����һ��ʵ��
	//���췽��˽�л�
	private Student (String name) {
		stuName=name;
		System.out.println("ѧ��������Ϊ"+stuName);
			}
	//��̬���з������������
	public static Student get(){
		return stu;
	}

}
