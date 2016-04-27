package testtwo;


public class Teacher {
	 private String teaName;
	private String teaSpecialty;
	  private String teaCourse;
	  private int teaYears;
	 public void teach(){
		 System.out.println(teaName+"正在讲"+teaCourse);
	 }
	  public void checkHomework(Student stu){
		  System.out.println("讲授"+teaCourse+"课程的老师："+teaName+"已经批改完毕："+stu.getStuName()+"的作业！");
	  }
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public String getTeaSpecialty() {
		return teaSpecialty;
	}
	public void setTeaSpecialty(String teaSpecialty) {
		this.teaSpecialty = teaSpecialty;
	}
	public String getTeaCourse() {
		return teaCourse;
	}
	public void setTeaCourse(String teaCourse) {
		this.teaCourse = teaCourse;
	}
	public int getTeaYears() {
		return teaYears;
	}
	public void setTeaYears(int teaYears) {
		this.teaYears = teaYears;
	}
	  
}
