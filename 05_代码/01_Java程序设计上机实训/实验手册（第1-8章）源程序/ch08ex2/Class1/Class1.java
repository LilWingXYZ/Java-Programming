import java.io.*;

public class Class1{
  public static void main(String[] args){
    File file = new File("Class1.java");
    if(file.exists()){
      System.out.println("�ļ�����");
      System.out.println("�ļ�����Ϊ:" + file.length());
    }
  }
}