public class JCDemo{
  public static void main(String[] args){
    People sushan = new People("��ɺ");
    Stud lili = new Stud("����");
    People zhaotian = new Stud("����");
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
  }
}