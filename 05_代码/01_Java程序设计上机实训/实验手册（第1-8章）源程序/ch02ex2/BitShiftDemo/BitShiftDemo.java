public class BitShiftDemo
{
  public static void main(String[] args)
  {
    int a = -16,b = 16;
    System.out.println("*************************************************"); 
    System.out.println("a�Ķ�������Ϊ:   " + Integer.toBinaryString(a));
    System.out.println("a����2λ���λΪ:" + Integer.toBinaryString(a<<2));
    System.out.println(a + "<<2=" + (a<<2));

    System.out.println("*************************************************"); 
    System.out.println("a�Ķ�������Ϊ��  " + Integer.toBinaryString(a));
    System.out.println("a����2λ���λΪ:" + Integer.toBinaryString(a>>2));
    System.out.println(a + ">>2=" + (a>>2));

    System.out.println("*************************************************"); 
    System.out.println("a�Ķ�������Ϊ��  " + Integer.toBinaryString(a));
    System.out.println("a����2λ���λΪ:" + Integer.toBinaryString(a>>>2));
    System.out.println(a + ">>>2=" + (a>>>2));

    System.out.println("*************************************************"); 
    System.out.println("b�Ķ�������Ϊ��  " + Integer.toBinaryString(b));
    System.out.println("b����2λ���λΪ:" + Integer.toBinaryString(b<<2));
    System.out.println(b + "<<2=" + (b<<2));

    System.out.println("*************************************************"); 
    System.out.println("b�Ķ�������Ϊ��  " + Integer.toBinaryString(b));
    System.out.println("b����2λ���λΪ:" +  Integer.toBinaryString(b>>2));
    System.out.println(b + ">>2=" + (b>>2));

    System.out.println("*************************************************"); 
    System.out.println("b�Ķ�������Ϊ��  " + Integer.toBinaryString(b));
    System.out.println("b����2λ���λΪ:" +  Integer.toBinaryString(b>>>2));
    System.out.println(b + ">>>2=" + (b>>>2));
    System.out.println("*************************************************");
  }
}