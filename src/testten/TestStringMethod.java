package testten;

public class TestStringMethod {
	public static void main(String[] args) {
		String fileName = "20140801 柳海龙  Resume.docx";
		System.out.println(fileName.startsWith("2014"));// 判断字符串是否以"2014"开头
		System.out.println(fileName.endsWith("docx"));// 判断字符串是否已"docx"结尾
		System.out.println(fileName.endsWith("doc"));// 判断字符串是否以"doc"结尾
		System.out.println(fileName.toLowerCase());// 将大写变为小写
		System.out.println(fileName.toUpperCase());// 将小写变为大写
		System.out.println(fileName.substring(9));// 从第9个位置开始到结尾截取字符串
		System.out.println(fileName.substring(9, 12));// 从第10个位置开始到第12个位置结尾截取字符串（包前不包后）
		String fileName2 = " 20140801 柳海龙 Resume .docx ";// 忽略原字符串前后空格
		System.out.println(fileName.trim());// 忽略原字符串前后空格
		System.out.println(fileName.indexOf("柳"));// 返回"柳"在字符串中第一次出现处的索引，索引从0开始
		System.out.println(fileName.indexOf(" "));// 返回"（空格）"在字符串中第一次出现处的索引，索引从0开始
		// 返回从索引2处开始搜索，"d"在该字符串的位置，若搜索不到则返回-1
		System.out.println(fileName.indexOf("d", 2));
		System.out.println(fileName.indexOf("d", 22));
	}

}
