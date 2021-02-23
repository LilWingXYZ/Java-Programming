class Student{
  private String name;
  private String id;
  private int age;
  private char sex;
  Student(){
    name = " ";
    id = " ";
    age = 0;
    sex = ' ';
  }
  Student(String name,String id,int age,char sex){
    this.name = name;
    this.id = id;
    this.age = age;
    this.sex = sex; 
  }
  void print(){
    System.out.println("����:" + name);
    System.out.println("ѧ��:" + id);
    System.out.println("����:" + age);
    System.out.println("�Ա�:" + sex);
    System.out.println("******************");
  }
}
public class StudentDemo{
  public static void main(String[] args){
    Student s1 = new Student();
    Student s2 = new Student("����","271040329",21,'��');
    s1.print();
    s2.print();
  }
}