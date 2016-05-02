package testten;

public class TestStringEquals {
	public static void main(String[] args) {

		String s1 = "java 基础";
		String s2 = "java 基础";
		System.out.println(s1 == s2);// 返回true
		System.out.println(s1.equals(s2));// 返回true
		String s3 = new String("前端技术");
		String s4 = new String("前端技术");
		System.out.println(s3 == s4);// 返回false
		System.out.println(s3.equals(s4));// 返回true

	}

	
}
