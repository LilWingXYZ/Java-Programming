class MyException extends Exception{
  private int x;
  MyException(int a){
    x = a;
  }
  public String toString(){
    return "�Զ����쳣��MyException";
  }
}

public class ExceptionMainDemo{
  static void method(int a)throws MyException{
    System.out.println("\t�˴�����method(" + a + ")");
    if(a>10)throw new MyException(a);
      System.out.println("��������");
  }
  public static void main(String[] args){
    try{
      System.out.println("\n����������ִ�п��ܷ����쳣�ĳ����");
      method(8);
      method(20);
      method(6);
    }
    catch(MyException e){
      System.out.println("\t�������쳣���ڴ˴����д���");
      System.out.println("\t�������쳣Ϊ:" + e.toString());
    }
    System.out.println("�����ִ����������");
  }
}