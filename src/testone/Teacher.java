package testone;

public class Teacher {
  String teaName;
  String teaSpecialty;
  String teaCourse;
  int teaYears;
 public void teach(){
	 System.out.println(teaName+"正在讲"+teaCourse);
 }
  public void checkHomework(Student stu){
	  System.out.println("讲授"+teaCourse+"课程的老师："+teaName+"已经批改完毕："+stu.stuName+"的作业！");
  }
}
