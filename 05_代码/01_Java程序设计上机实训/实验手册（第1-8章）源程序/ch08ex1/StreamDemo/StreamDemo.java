import java.io.*;

public class StreamDemo{
  public static void main(String[] args){
    String s;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try{
      do{
        s = in.readLine(); //�Ӽ��̶���һ���ַ���
        if(s!=null)
          System.out.println("Read:" + s);
      }while(s!=null);  //�ж��Ƿ��������
    } 
    catch(IOException e){}
  }
}