package testeleven;

import java.util.Scanner;

public class EngRegister {
	public static void main(String[] args) {
		String p1, p2, name;
		do {
			System.out.println("������java����ʦ�л�����");
			Scanner input = new Scanner(System.in);
			name = input.next();
			System.out.println("���������룺");
			p1 = input.next();
			System.out.println("���ٴ��������룺");
			p2 = input.next();
		} while (!verify(name, p1, p2));
		System.out.println("ע��ɹ������μ��û��������롣");

	}

	public static boolean verify(String name, String p1, String p2) {// �ж������Ƿ���Ϲ涨
		if (name.length() < 6 || p1.length() < 8)// �û��ĳ��Ȳ���С��6������ĳ��Ȳ���С��8
		{
			System.out.println("�û��ĳ��Ȳ���С��6������ĳ��Ȳ���С��8");
			return false;

		} else if (p1.length() != p2.length()) {
			System.out.println("������������벻��ͬ!");
			return false;

		} else
			return true;
	}

}
