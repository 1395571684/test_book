package testten;

import java.util.Scanner;
import java.util.Spliterators;

public class TestStringMethod2 {
	public static void main(String[] args) {
		String result = String.valueOf(100);// ���ػ����������Ͳ������ַ�����ʾ��ʽ
		System.out.println(result);
		Scanner input = new Scanner(System.in);
		System.out.println("�����ȥһ���нˮ�ܺͣ�");
		int lastSalary = input.nextInt();
		// ͨ��String�ྲ̬ �෽����lastSlary��int����ת����String�ַ���
		String strSalary = String.valueOf(lastSalary);
		System.out.println("����ȥһ���нˮ�ܺ��ǣ�" + strSalary.length() + "λ��");
		String date = "  ,Mary,one,2016";
		String[] splitStr = date.split(",");// ��","���ַ����ָ���һ���µ��ַ�������
		System.out.println("Mary,one,2016ʹ��,�ָ����Ľ���ǣ�");
		for (int i = 0; i < splitStr.length; i++) {
			System.out.println(splitStr[i]);
		}

	}

}
