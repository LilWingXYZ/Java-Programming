import java.io.*;

public class InputDemo{
  public static void main(String[] args)throws IOException{
    String str;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("input a float:");
    str = br.readLine();
    float f1 = Float.valueOf(str).floatValue();
    System.out.println("input another a float:");
    str = br.readLine();
    float f2 = Float.valueOf(str).floatValue();
    System.out.println("���ǵĺ���:" + (f1+f2));
  }
}