public class ThrowsDemo{
  static void method()throws IllegalAccessException{
    System.out.println("\n��method���׳�һ���쳣");
    throw new IllegalAccessException();
  }
  public static void main(String[] args){
    try{
      method();
    }
    catch(IllegalAccessException e){
      System.out.println("��main�в����쳣:" + e);
    }
  }
}