package testeleven;

public class TestJavaApi {
	public static void main(String[] args) {
		String str="我是一名学生";
		System.out.println(str);
		char[] a=new char[10];
		a=str.toCharArray();//将此字符串转换为一个新的字符数组。
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(str.compareTo("我是一名老师"));// 按字典顺序比较两个字符串。
		System.out.println(str.compareTo("我是一名学生"));
		String s1="abc";
		System.out.println(s1.compareTo("add"));
		System.out.println(s1.isEmpty());//当且仅当 length() 为 0 时返回 true。
	}

}
