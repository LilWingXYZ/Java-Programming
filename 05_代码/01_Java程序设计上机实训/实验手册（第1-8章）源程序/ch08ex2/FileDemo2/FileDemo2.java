import java.io.*;

public class FileDemo2{
  public static void main(String[] args)throws IOException{
    File file = new File("b/testb.txt");
    System.out.println("�ļ�����" + file.getName());
    System.out.println("���·����" + file.getPath());
    System.out.println("����·����" + file.getAbsoluteFile());
    System.out.println("��Ŀ¼����" + file.getParent());
  }
}