package testten;

public class TestStringMethod {
	public static void main(String[] args) {
		String fileName = "20140801 ������  Resume.docx";
		System.out.println(fileName.startsWith("2014"));// �ж��ַ����Ƿ���"2014"��ͷ
		System.out.println(fileName.endsWith("docx"));// �ж��ַ����Ƿ���"docx"��β
		System.out.println(fileName.endsWith("doc"));// �ж��ַ����Ƿ���"doc"��β
		System.out.println(fileName.toLowerCase());// ����д��ΪСд
		System.out.println(fileName.toUpperCase());// ��Сд��Ϊ��д
		System.out.println(fileName.substring(9));// �ӵ�9��λ�ÿ�ʼ����β��ȡ�ַ���
		System.out.println(fileName.substring(9, 12));// �ӵ�10��λ�ÿ�ʼ����12��λ�ý�β��ȡ�ַ�������ǰ������
		String fileName2 = " 20140801 ������ Resume .docx ";// ����ԭ�ַ���ǰ��ո�
		System.out.println(fileName.trim());// ����ԭ�ַ���ǰ��ո�
		System.out.println(fileName.indexOf("��"));// ����"��"���ַ����е�һ�γ��ִ���������������0��ʼ
		System.out.println(fileName.indexOf(" "));// ����"���ո�"���ַ����е�һ�γ��ִ���������������0��ʼ
		// ���ش�����2����ʼ������"d"�ڸ��ַ�����λ�ã������������򷵻�-1
		System.out.println(fileName.indexOf("d", 2));
		System.out.println(fileName.indexOf("d", 22));
	}

}
