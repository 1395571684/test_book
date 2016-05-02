package testeleven;

public class TestSplit {
	public static void main(String[] args) {
		String str = "九寨沟、昆明、三亚、黄山";
		System.out.println("***原字符串****" + str);
		String[] splitStr = str.split("、");
		for (int i = 0; i < splitStr.length; i++) {
			System.out.println("我想去：" + splitStr[i]);
		}
	}

}
