class People2{
  String name;
  int age;
  String sex;
  People2(){
    System.out.println("*****�����˸������****!");
  }
  People2(String name){
    System.out.println(name);
    System.out.println("�����˸���Ķ���");
  }
  void eat(){
    System.out.println("��ʼ�Է���!!!");
  }
  void sleep(){
    System.out.println("���Ѿ�˯����!!!");
  }
  void work(){
    System.out.println("�ҿ�ʼ������!!!");
  }
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void setSex(String sex){
    this.sex = sex;
  }
}
class Stud extends People2{
  String snum;
  String grade;
  Stud(String name){
    System.out.println(name);
    System.out.println("�������������!");
  }
  void work(){
    super.work();
    System.out.println("����ѧȥ��!");
  }
  void exam(){
    System.out.println("ʹ������̿�ʼ��--����");
  }
}

public class JCDemo2{
  public static void main(String[] args){
    People2 sushan = new People2("��ɺ");
    Stud lili = new Stud("����");
    People2 zhaotian = new Stud("����");
    //Stud aimoli = new People();

    sushan.eat();
    sushan.sleep();
    sushan.work();
    
    lili.exam();
    lili.eat();
    lili.work();
    
    zhaotian.work();
    Stud s1 = (Stud)zhaotian;
    s1.exam();
    s1.setName("����");
    s1.setAge(20);
    s1.setSex("��");
    System.out.println("����:" + s1.name + " ����:" + s1.age + " �Ա�:" + s1.sex);
  }
}