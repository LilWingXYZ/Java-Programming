interface NL{
  int year = 2010;
  int age();
  void output();
}

public class PersonNL implements NL{
  String xm;
  int csrq;
  public PersonNL(String n1,int y){
    xm = n1;
    csrq = y;
  }
  public int age(){
    return year-csrq;
  }
  public void output(){
    System.out.println(this.xm + "�����������" + this.age() + "��");
  }
  public static void main(String[] args){
    NL a = new PersonNL("����",1990);
    a.output();
  }
}  