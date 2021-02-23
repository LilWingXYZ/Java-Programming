abstract class Student{
  static int CourseNo = 3;
  String type;
  String name;
  int[] courses;
  String courseGrade;

  public Student(String name){
    this.name = name;
    courses = new int[CourseNo];
    courseGrade = null;
  }
  public abstract void calculateGrade();
  public String getType(){
    return type;
  }
  public void setType(String type){
    this.type = type;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int[] getCourses(){
    return courses;
  }
  public void setCourses(int[] courses){
    this.courses = courses;
  }
  public int getCourseScore(int courseNumber){
    return courses[courseNumber];
  }
  public void setCourseScore(int courseNumber,int courseScore){
    this.courses[courseNumber] = courseScore;
  }
  public String getCourseGrade(){
    return courseGrade;
  }
  public void setCourseGrade(String courseGrade){
    this.courseGrade = courseGrade;
  }
}

class Undergraduate extends Student{
  public Undergraduate(String name){
    super(name);
    type = "������";
  }
  public void calculateGrade(){
    int total = 0;
    double average = 0;
    for(int i=0;i<CourseNo;i++){
      total += courses[i];
    }
    average = total/CourseNo;
    if(average>=80 && average<=100)
      courseGrade = "����";
    else if(average>=70 && average<80)
      courseGrade = "����";
    else if(average>=60 && average<70)
      courseGrade = "�е�";
    else if(average>=50 && average<60)
      courseGrade = "����";
    else
      courseGrade = "������";
  }
}

class Postgraduate extends Student{
  public Postgraduate(String name){
      super(name);
      type = "�о���";
    }
  public void calculateGrade(){
    int total = 0;
    double average = 0;
    for(int i=0;i<CourseNo;i++){
      total += courses[i];
    }
    average = total/CourseNo;
    if(average>=90 && average<=100)
      courseGrade = "����";
    else if(average>=80 && average<90)
      courseGrade = "����";
    else if(average>=70 && average<80)
      courseGrade = "�е�";
    else if(average>=60 && average<70)
      courseGrade = "����";
    else
      courseGrade = "������";
  }
}

public class Polymorphism{
  public static void main(String[] args){
    Student[] students = new Student[5];
    students[0] = new Undergraduate("�½�ƽ");
    students[1] = new Undergraduate("³��");
    students[2] = new Postgraduate("������");
    students[3] = new Undergraduate("������");
    students[4] = new Postgraduate("������");
    for(int i=0;i<5;i++){
      students[i].setCourseScore(0,87);
      students[i].setCourseScore(1,90);
      students[i].setCourseScore(2,78);
    }
    for(int i=0;i<5;i++){
      students[i].calculateGrade();
    }
    System.out.println("����" + "     ����" + "     �ɼ�");
    System.out.println("----------------------------");
    for(int i=0;i<5;i++){
      System.out.println(students[i].getName() + "   " + students[i].getType() + "   " + students[i].getCourseGrade());
    }
  }
}