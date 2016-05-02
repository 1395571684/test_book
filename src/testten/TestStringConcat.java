package testten;

public class TestStringConcat {
	public static void main(String[] args) {
		// 使用+进行字符串连接
		System.out.println("使用+进行字符串连接");
		String s1 = "你好";
		s1 = s1 + "李同学";
		System.out.println(s1);
		// 使用concat方法连接
		System.out.println("使用concat方法连接");
		String s2 = "你好";
		// 创建一个新字符串来连接两个字符串，但没有变量指向这个新字符串
		s2.concat("王同学");
		// 创建一个新字符串来连接两个字符串，并让s3指向这个新字符串
		String s3 = s2.concat("王同学");
		System.out.println(s2);
		System.out.println(s3);
	}

}
