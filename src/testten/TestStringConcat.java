package testten;

public class TestStringConcat {
	public static void main(String[] args) {
		// ʹ��+�����ַ�������
		System.out.println("ʹ��+�����ַ�������");
		String s1 = "���";
		s1 = s1 + "��ͬѧ";
		System.out.println(s1);
		// ʹ��concat��������
		System.out.println("ʹ��concat��������");
		String s2 = "���";
		// ����һ�����ַ��������������ַ�������û�б���ָ��������ַ���
		s2.concat("��ͬѧ");
		// ����һ�����ַ��������������ַ���������s3ָ��������ַ���
		String s3 = s2.concat("��ͬѧ");
		System.out.println(s2);
		System.out.println(s3);
	}

}
