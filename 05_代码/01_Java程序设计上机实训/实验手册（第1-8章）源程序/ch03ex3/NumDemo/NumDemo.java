public class NumDemo
{
  public static void main(String[] args)
  {
    int n,num,num1;
    System.out.println("��1~1000�ɱ�3��5������Ϊ");
    for(n=1;n<=1000;n++)
    {
      if(n%3==0 && n%5==0)
        System.out.print(n + "\t");
    }
    System.out.println(" ");
  }
}