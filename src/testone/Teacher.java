package testone;

public class Teacher {
  String teaName;
  String teaSpecialty;
  String teaCourse;
  int teaYears;
 public void teach(){
	 System.out.println(teaName+"���ڽ�"+teaCourse);
 }
  public void checkHomework(Student stu){
	  System.out.println("����"+teaCourse+"�γ̵���ʦ��"+teaName+"�Ѿ�������ϣ�"+stu.stuName+"����ҵ��");
  }
}
