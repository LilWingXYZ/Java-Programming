import java.io.*;

public class ScoreChange
{
  void grade(int score)
  {
    if(score<=100 && score>89)
      System.out.println("ѧ���ɼ�Ϊ��");
    else if(score>79)
      System.out.println("ѧ���ɼ�Ϊ��");
    else if(score>69)
      System.out.println("ѧ���ɼ�Ϊ��");
    else if(score>59)
      System.out.println("ѧ���ɼ�Ϊ����");
    else
      System.out.println("ѧ���ɼ�Ϊ������");
  }
  public static void main(String[] args)
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
    String strin="";
    int s = 0;
    System.out.print("please input to data:");
    try
    {
      strin = in.readLine();
      s = Integer.parseInt(strin);
    }
    catch(IOException e)
    {
    }
    ScoreChange score1 = new ScoreChange();
    score1.grade(s);
  }
}