package testfive;

public class Student {
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;
	//���췽�����û���ʼ����������
		public Student(String stuName, int stuAge, int stuSex, int stuGrade) {
			super();
			this.stuName = stuName;
			this.stuAge = stuAge;
			this.stuSex = stuSex;
			this.stuGrade = stuGrade;
		}
		//���췽�����û���ʼ���������ԣ������꼶�����������꼶����Ĭ��ֵΪ4��
		public Student(String stuName, int stuAge, int stuSex) {
			super();
			this.stuName = stuName;
			this.stuAge = stuAge;
			this.stuSex = stuSex;
			this.stuGrade=4;
		}
		//���췽�����û���ʼ���������ԣ��������䣬�꼶�����������������Ĭ��ֵΪ22���꼶����Ĭ��ֵΪ4��
		public Student(String stuName, int stuSex) {
			super();
			this.stuName = stuName;
			this.stuSex = stuSex;
			this.stuAge=22;
			this.stuGrade=4;
		}
		//�޲ι��췽��
		public Student(){}
		//�������name��age��sex��grade��ֵ��������
		public void learn(String name,int age,int sex,int grade){
			String sexStr=(sex==1)?"����":"Ů��";
			System.out.println(age+"��Ĵ�ѧ"+grade+"�꼶"+sexStr+name+"������������");
		}
		//�������name��age��sex��ֵ��gradeֵȡ4��������
		public void learn(String name,int age,int sex){
			learn(name,age,sex,4);
		}
		//�������name��sex��ֵ��age��ֵȡ22��gradeֵȡ4��������
		public void learn(String name,int sex){
			learn(name,22,sex,4);
		}
		//�޲ε����η�����ʹ�ó�Ա������ֵ��Ϊ����
		public void learn(){
			learn(this.stuName,this.stuAge,this.stuSex,this.stuGrade);
		}
		public static void main(String[] args) {
			Student stu=new Student("����",20,1,4);
			stu.learn("����",21,1,3);
			stu.learn("����", 23, 1);
			stu.learn("��", 1);
			stu.learn();
		}
}
