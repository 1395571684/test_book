/**
 * 用户输入一个整数，返回一个从1到这个整数之间的随机数
 */
package testsix;

import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		     System.out.println("请输入一个整数");
		     int num=input.nextInt();//num记录输入的整数
		     //生成一个大于等于1且小于等于num的随机数
		     int result=((int)(Math.random()*1000)%num)+1;
		     System.out.println(result);
	}

}
