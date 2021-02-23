import java.io.*;

public class Class2{
  public static void main(String[] args){
    try{
      File oDir = new File(".");
      String[] strList;
      //���û��ѡ���в�����ȡ��ǰĿ¼�µ������ļ��б�
      if(0 == args.length)
        strList = oDir.list();
      else
        strList = oDir.list(new DirFilter(args[0]));
      for(int i=0;i<strList.length;i++)
        System.out.println(strList[i]); 
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}

class DirFilter implements FilenameFilter{
  String strPick;
  DirFilter(String pickname){
    this.strPick = pickname;
  }
  public boolean accept(File dir,String name){
    return name.endsWith(strPick);  //endsWith()���Դ��ַ����Ƿ���ָ���ĺ�׺����
  }
}