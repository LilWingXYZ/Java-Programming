class Person{
  String name;
  char sex;
  int age;
  Person(String pName,char pSex,int pAge){
    name = pName;
    sex = pSex;
    age = pAge;
  }
  public String toString(){
    String s = ("����:" + name + " �Ա�:" + sex + " ����:" +age);
    return s;
  }
}

public class CreatePerson{
  public static void main(String[] args){
    Person p1 = new Person("����",'��',20);
    Person p2 = new Person("����",'Ů',28);
    p1.sex = 'Ů';
    System.out.println(p1.toString());
    p2.age = 33;
    System.out.println(p2.toString());
  }
}