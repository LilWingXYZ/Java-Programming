class RunDemo{
  private String userName,password;
  RunDemo(){
    System.out.println("ȫ��Ϊ��!");
  }
  RunDemo(String name){
    userName = name;
  }
  RunDemo(String name,String pwd){
    this(name);
    password = pwd;
    check();
  }
  void check(){
    String s = null;
    if(userName!=null){
      s = "�û���:" + userName;
    }
    else 
      s = "�û�������Ϊ��!";
    if(password!="12345678"){
      s = s + "������Ч!";
    }
    else{
      s = s + " ����:********";
    }
    System.out.println(s);
  }
}

public class EnterDemo{
  public static void main(String[] args){
    new RunDemo();
    new RunDemo("����");
    new RunDemo(null,"����");
    new RunDemo("����","12345678");
  }
}