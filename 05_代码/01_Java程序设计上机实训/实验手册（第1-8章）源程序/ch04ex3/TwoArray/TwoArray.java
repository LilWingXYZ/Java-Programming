import java.util.*;

public class TwoArray
{
  public static void main(String[] args)
  {
    System.out.println("��������Ҫ��ʼ�������������");
    Scanner sc1 = new Scanner(System.in);
    int h = sc1.nextInt();
    Arr Test = new Arr(h);
    Test.init();
    while(true)
    {
      System.out.println("��ѡ����Ҫ�Ĳ���");
      System.out.println("����1Ϊ�������������鲢��ʼ����");
      System.out.println("����2Ϊ�������ǰ�����е����ֵ��");
      System.out.println("����3Ϊ�������ǰ�����е���Сֵ��");
      System.out.println("����4Ϊ�������ǰ�����ƽ��ֵ��");
      System.out.println("����5Ϊ�������ǰ����ĺ�ֵ��");
      System.out.println("����6Ϊ�������ǰ���顿");
      System.out.println("����0Ϊ���˳���");
      Scanner sc2 = new Scanner(System.in);
      int choice = sc2.nextInt();
      if(choice==0)
      {
        System.out.println("����");
        break;
      }
      else if(choice==1)
      {
        System.out.println("������Ҫ�������õ�����");
        Scanner sc3 = new Scanner(System.in);
        int reset_h = sc3.nextInt();
        Test.setH(reset_h);
        Test.init();
      }
      else if(choice==2)
      {
        System.out.println("��ǰ�����е����ֵΪ" + Test.max());
      }
      else if(choice==3)
      {
        System.out.println("��ǰ�����е���СֵΪ" + Test.min());
      }
      else if(choice==4)
      {
        System.out.println("��ǰ�����ƽ��ֵΪ" + Test.average());
      }
      else if(choice==5)
      {
        System.out.println("��ǰ����ĺ�ֵΪ" + Test.total());
      }
      else if(choice==6)
      {
        Test.print();
      }
      else
      {
        System.out.println("ѡ�����");
      }
    }//while
  }//main
}//class

class Arr
{
  double arr[][];
  
  Arr(int h)
  {
    setH(h);
  }
  void setH(int h)
  {
    arr = new double[h][];
  } 
  void setL(int h,int l)
  {
    arr[h] = new double[l];
  }
  void init()
  {
    Scanner sc1 = new Scanner(System.in);
    for(int k=0;k<arr.length;k++)
    {
      System.out.println("�������" + (k+1) + "�е�����");
      int l = sc1.nextInt();
      setL(k,l);
    }
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        System.out.println("����������");
        Scanner sc2 = new Scanner(System.in);
        double temp = sc2.nextDouble();
        arr[i][j] = temp;
      }
    }
  }
 
  double min()
  {
    double min = arr[0][0];
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        if(min>arr[i][j])
        {
          min = arr[i][j];
        }
      }
    }//for
    return min;
  }
  
  double max()
  {
    double max = arr[0][0];
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        if(max<arr[i][j])
        {
          max = arr[i][j];
        }
      }
    }//for
    return max;
  }
  
  double total()
  {
    double total = 0;
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        total+=arr[i][j];
      }
    }
   return total;
  }
  
  double average()
  {
    int totalNum = 0;
    for(int i=0;i<arr.length;i++)
    {
      totalNum += arr[i].length;
    }
    return(total()/totalNum);
  }
  
  void print()
  {
    for(int i=0;i<arr.length;i++)
    { 
      System.out.println();
      for(int j=0;j<arr[i].length;j++)
      {
        System.out.print(arr[i][j] + "\t");
      }
    }
  }
}
