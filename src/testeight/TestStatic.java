package testeight;

public class TestStatic {
	public static void main(String[] args) {
		Student wang = new Student();
		wang.age = 21;
		System.out.println("王云的年龄为：" + wang.age);
		Student liu = new Student();
		liu.age = 22;
		System.out.println("王云的年龄为：" + wang.age);
		System.out.println("刘静的年龄为：" + liu.age);
		Student.showAge();
		System.out.println("静态变量输出年龄为：" + Student.age);
	}

}
