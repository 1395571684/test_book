package testeleven;

public class TestJavaApi {
	public static void main(String[] args) {
		String str="����һ��ѧ��";
		System.out.println(str);
		char[] a=new char[10];
		a=str.toCharArray();//�����ַ���ת��Ϊһ���µ��ַ����顣
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(str.compareTo("����һ����ʦ"));// ���ֵ�˳��Ƚ������ַ�����
		System.out.println(str.compareTo("����һ��ѧ��"));
		String s1="abc";
		System.out.println(s1.compareTo("add"));
		System.out.println(s1.isEmpty());//���ҽ��� length() Ϊ 0 ʱ���� true��
	}

}
