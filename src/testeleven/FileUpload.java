package testeleven;

import java.util.Scanner;

public class FileUpload {
	public static void main(String[] args) {
		System.out.println("请按照下面的要求提交论文：");
		System.out.println("请输入论文文件名(必须以docx结尾)：");
		Scanner input = new Scanner(System.in);
		String fileName = input.next();
		System.out.println("请输入你的接受论文反馈邮箱：");
		String email = input.next();
		if (!fileName.endsWith("docx")) {// 论文没有一docx结尾
			System.out.println("文件名无效！");
			System.out.println("论文提交无效！");
			return;
		} else if (email.indexOf("@") > email.indexOf(".") || email.indexOf("@") == -1 || email.indexOf(".") == -1) {// 邮箱格式不正确
			System.out.println("邮箱无效！");
			System.out.println("论文提交无效！");
			return;

		} else {
			System.out.println("论文提交成功！");
			return;
		}
	}
}
