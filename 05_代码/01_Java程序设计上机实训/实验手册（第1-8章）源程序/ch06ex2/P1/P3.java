import P2.YMD;

public class P3{
  private String name;
  private YMD birth;
  public static void main(String[] args){
    P3 a = new P3("�ų�",1990,1,11);
    a.output();
  }
  public P3(String n1,YMD d1){
    name =n1;
    birth = d1;
  }
  public P3(String n1,int y,int m,int d){
    this(n1,new YMD(y,m,d));
  }
  public int age(){
    return(YMD.thisyear()-birth.year());
  }
  public void output(){
    System.out.println("����:" + name);
    System.out.println("��������:" + birth.toString());
    System.out.println("����:" + age());
  }
}