package testeight;

public class TestStatic {
	public static void main(String[] args) {
		Student wang = new Student();
		wang.age = 21;
		System.out.println("���Ƶ�����Ϊ��" + wang.age);
		Student liu = new Student();
		liu.age = 22;
		System.out.println("���Ƶ�����Ϊ��" + wang.age);
		System.out.println("����������Ϊ��" + liu.age);
		Student.showAge();
		System.out.println("��̬�����������Ϊ��" + Student.age);
	}

}
