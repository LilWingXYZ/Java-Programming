import java.io.*;

public class ReadFile{
  public static void main(String[] args)throws Exception{
    String filename,s,t;
    int n = 0;
    long leng,filepoint;
    RandomAccessFile file = new RandomAccessFile("text.txt","rw");
    leng = file.length();
    t = args[1];
    //����ѭ�������ɽ���ѡ���н��ܵ��������ַ�ת������������
    for(int i=0;i<t.length();i++)
      n = 10*n + (int)(t.charAt(i)-48);
    //���ļ�ָ����ǰ�ƶ����n���ַ�����ע������Ϊ��Ҫ��������ת��Ϊ����
    file.skipBytes((int)(leng-n));
    filepoint = file.getFilePointer();
    while(filepoint<leng){
      s = file.readUTF();   //��ȡ���ݲ���ֵ������s
      System.out.println(s);
      filepoint = file.getFilePointer();
    }
    file.close();
  }
}