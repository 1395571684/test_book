package testten;

import java.util.Scanner;
import java.util.Spliterators;

public class TestStringMethod2 {
	public static void main(String[] args) {
		String result = String.valueOf(100);// 返回基本数据类型参数的字符串表示形式
		System.out.println(result);
		Scanner input = new Scanner(System.in);
		System.out.println("输入过去一年的薪水总和：");
		int lastSalary = input.nextInt();
		// 通过String类静态 类方法将lastSlary从int类型转换成String字符串
		String strSalary = String.valueOf(lastSalary);
		System.out.println("您过去一年的薪水总和是：" + strSalary.length() + "位数");
		String date = "  ,Mary,one,2016";
		String[] splitStr = date.split(",");// 用","将字符串分隔成一个新的字符串数组
		System.out.println("Mary,one,2016使用,分隔过的结果是：");
		for (int i = 0; i < splitStr.length; i++) {
			System.out.println(splitStr[i]);
		}

	}

}
