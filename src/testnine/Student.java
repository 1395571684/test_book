package testnine;

public class Student {
	public static String staticString="��̬����";//��̬����
	private String stuName="";//ѧ��������˽�б���
	static{
		System.out.println("*************ʹ�þ�̬���ʼ��*************");
		System.out.println("��̬����ʹ�õľ�̬����ֵΪ��"+staticString);
	}
	{
		stuName="�׾�";
		System.out.println("*************ʹ�ó�ʼ�����ʼ��*************");
		System.out.println("��ʼ������ʹ�õľ�̬����ֵΪ��"+staticString);
		System.out.println("��ʼ��������ʾ��ʵ������ֵΪ��"+stuName);
	}
	Student(String str){
		stuName=str;
		System.out.println("*************ʹ�ù��캯����ʼ��*************");
		System.out.println("���캯����ʹ�õľ�̬����ֵΪ��"+staticString);
		System.out.println("���캯������ʾ��ʵ������ֵΪ��"+stuName);
	}
	public void sysStatic(){
		System.out.println("��̬������ֵΪ��"+staticString);
	}
	public static void main(String[] args) {
		Student stu=new Student("����");
		stu.staticString="�Ķ����ľ�̬����";
		stu.sysStatic();
		System.out.println("���Ƶľ�̬����Ϊ��"+stu.staticString);
		Student stu1=new Student("���");
		stu.staticString="�ٴα��Ķ��ľ�̬����";
		stu.sysStatic();
		System.out.println("���Ƶľ�̬����Ϊ��"+stu.staticString);
	}
	
}

