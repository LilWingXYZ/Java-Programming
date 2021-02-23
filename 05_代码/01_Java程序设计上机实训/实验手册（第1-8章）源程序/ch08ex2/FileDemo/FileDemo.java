import java.io.*;

public class FileDemo{
  public static void printAllFile(File f){
    System.out.println(f.getName());
    //isDirectory()���Դ˳���·������ʾ���ļ�ʱ����һ��Ŀ¼���� ����true�񷵻�false
    if(f.isDirectory()){
      //listFile()����һ������·�������飬��Щ·������ʾ��Ŀ¼�е��ļ�
      File[] f1 = f.listFiles();
      int len = f1.length;
      for(int i=0;i<len;i++)
        printAllFile(f1[i]);
    }
  }
  public static void deleteAllFile(File f){
    if(f.isFile())
      f.delete();
    else{
      File[] f1 = f.listFiles();
      int len = f1.length;
      for(int i=0;i<len;i++)
        deleteAllFile(f1[i]);
     // f.delete();
    }
  }
  public static void main(String[] args){
    File f1 = new File("book");
    printAllFile(f1);
    File f2 = new File("test");
    deleteAllFile(f2);
  }
}