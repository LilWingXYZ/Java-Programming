public class Stud extends People{
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