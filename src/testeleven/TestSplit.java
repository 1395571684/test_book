package testeleven;

public class TestSplit {
	public static void main(String[] args) {
		String str = "��կ�������������ǡ���ɽ";
		System.out.println("***ԭ�ַ���****" + str);
		String[] splitStr = str.split("��");
		for (int i = 0; i < splitStr.length; i++) {
			System.out.println("����ȥ��" + splitStr[i]);
		}
	}

}
