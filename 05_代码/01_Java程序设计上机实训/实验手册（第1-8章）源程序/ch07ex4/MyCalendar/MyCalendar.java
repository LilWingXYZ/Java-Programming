import java.util.*;

public class MyCalendar{
  public static void main(String[] args){
    System.out.println(" �� һ �� �� �� �� ��");
    Calendar r1 = Calendar.getInstance();
    r1.set(2010,3,1);   //����������2010��4��1��
    int week = r1.get(Calendar.DAY_OF_WEEK)-1;
    String a[] = new String[week+30];//������31��ʱ�˴�xingqi+31��������30��ʱ�˴�xingqi+30
    for(int i=0;i<week;i++){
      a[i] = "**";
    }
    for(int i=week,n=1;i<week+30;i++){
      if(n<=9)
      //�����ں�Ϊ��λ����ʱ�������ֿ�����룬�������һ���ո�
        a[i] = String.valueOf(n) + " ";
      else
        a[i] = String.valueOf(n);
      n++;
    }
    for(int i=0;i<a.length;i++){
      if(i%7==0){
        System.out.println("");
      }
      System.out.print(" " + a[i]);
    }
  }
}