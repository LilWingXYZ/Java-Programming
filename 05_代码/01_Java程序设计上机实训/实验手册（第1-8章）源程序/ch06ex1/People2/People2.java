public class People2{
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