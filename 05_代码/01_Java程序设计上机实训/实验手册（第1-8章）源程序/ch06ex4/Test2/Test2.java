public class Test2{
  static int a = 3,b = 0;
  static String c[] = {"����Ԫ��c[0]"};
  public static void main(String[] args){
    try{
      System.out.println(a);
      System.out.println(a/b);
      System.out.println(c[b]);//�������������쳣������佫��������
    }
    catch(ArithmeticException e){
      System.out.println("��׽��һ�������쳣");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("��׽��һ�������±�Խ���쳣");
    }
    catch(Exception e){
      System.out.println("��׽��һ��ϵͳ�쳣");
    }
    finally{
      System.out.println("�������");
    }
  }
}