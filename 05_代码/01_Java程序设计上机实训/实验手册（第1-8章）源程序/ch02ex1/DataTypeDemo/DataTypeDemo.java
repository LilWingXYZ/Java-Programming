public class DataTypeDemo
{
  public static void main(String[] args)
  {
    byte b = 0x55;
    short s = 0x55ff;
    int i = 1000000;
    long l = 0xffffL;
    char c = 'a';
    float f = 0.23f;
    double d = 0.7e-3;
    boolean B = true;
    String S = "�����ַ�������������";
    System.out.println("�ֽ��ͱ��� b = " + b);
    System.out.println("�����α��� s = " + s);
    System.out.println("���α��� i = " + i);
    System.out.println("�����α��� l = " + l);
    System.out.println("�ַ��ͱ��� c = " + c);
    System.out.println("�����ȱ��� f = " + f);
    System.out.println("˫���ȱ��� d = " + d);
    System.out.println("�����ͱ��� B = " + B);
    System.out.println("�ַ�������� S = " + S);
  }
}