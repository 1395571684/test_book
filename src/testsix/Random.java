/**
 * �û�����һ������������һ����1���������֮��������
 */
package testsix;

import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		     System.out.println("������һ������");
		     int num=input.nextInt();//num��¼���������
		     //����һ�����ڵ���1��С�ڵ���num�������
		     int result=((int)(Math.random()*1000)%num)+1;
		     System.out.println(result);
	}

}
