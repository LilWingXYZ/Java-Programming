import java.io.*;
import java.util.*;
public class PrimeChar
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str;
    char ch;
    str = in.readLine();
    ch = str.charAt(0);
    if(ch>=65 && ch<=90)
      System.out.println("���ַ��Ǵ�д��ĸ");
    else if(ch>=97 && ch<=122)
      System.out.println("���ַ���Сд��ĸ");
    else
      System.out.println("���ַ�������ĸ");
  }
}