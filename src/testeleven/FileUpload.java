package testeleven;

import java.util.Scanner;

public class FileUpload {
	public static void main(String[] args) {
		System.out.println("�밴�������Ҫ���ύ���ģ�");
		System.out.println("�����������ļ���(������docx��β)��");
		Scanner input = new Scanner(System.in);
		String fileName = input.next();
		System.out.println("��������Ľ������ķ������䣺");
		String email = input.next();
		if (!fileName.endsWith("docx")) {// ����û��һdocx��β
			System.out.println("�ļ�����Ч��");
			System.out.println("�����ύ��Ч��");
			return;
		} else if (email.indexOf("@") > email.indexOf(".") || email.indexOf("@") == -1 || email.indexOf(".") == -1) {// �����ʽ����ȷ
			System.out.println("������Ч��");
			System.out.println("�����ύ��Ч��");
			return;

		} else {
			System.out.println("�����ύ�ɹ���");
			return;
		}
	}
}
