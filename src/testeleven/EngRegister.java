package testeleven;

import java.util.Scanner;

public class EngRegister {
	public static void main(String[] args) {
		String p1, p2, name;
		do {
			System.out.println("请输入java工程师有户名：");
			Scanner input = new Scanner(System.in);
			name = input.next();
			System.out.println("请输入密码：");
			p1 = input.next();
			System.out.println("请再次输入密码：");
			p2 = input.next();
		} while (!verify(name, p1, p2));
		System.out.println("注册成功！请牢记用户名和密码。");

	}

	public static boolean verify(String name, String p1, String p2) {// 判断输入是否符合规定
		if (name.length() < 6 || p1.length() < 8)// 用户的长度不能小于6，密码的长度不能小于8
		{
			System.out.println("用户的长度不能小于6，密码的长度不能小于8");
			return false;

		} else if (p1.length() != p2.length()) {
			System.out.println("两次输入的密码不相同!");
			return false;

		} else
			return true;
	}

}
