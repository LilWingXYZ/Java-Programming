class Student{
  private String name;
  private int age;
  private boolean sex;
  private double score;
  
  Student(String name,int age,boolean sex,double score){
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.score = score;
  }
  void show(){
    System.out.println("ѧ������Ϊ:" + name);
    System.out.println("ѧ������Ϊ:" + age);
    System.out.println("ѧ���Ա�Ϊ:" + sex);
    System.out.println("ѧ���ɼ�Ϊ:" + score);
    System.out.println("***************************");
  }
}

public class StudentDemo{
  public static void main(String[] args){
    Student s1 = new Student("����",18,true,89.5);
    Student s2 = new Student("����",17,false,98);
    s1.show();
    s2.show();
  }
}