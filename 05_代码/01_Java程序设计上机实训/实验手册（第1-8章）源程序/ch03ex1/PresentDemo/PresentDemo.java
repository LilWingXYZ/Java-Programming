import java.io.*;

public class PresentDemo
{
  public static void main(String[] args)throws IOException
  {
    char ch;
    System.out.println("��1/2/3���ּ��ɵô󽱣�");
    System.out.println("��q�����˳�ѭ��������");
    while((ch = (char)System.in.read())!=' ')
    {
      System.in.skip(2);           //�����س���
      switch(ch)
      {
        case '1':System.out.println("��ϲ��ô󽱣�һ������");break;
        case '2':System.out.println("����ѽ����õ�һ̨�ʼǱ�����");break;
        case '3':System.out.println("û�а�������õ�һ̨����");break;
        case 'q':System.out.println("��ӭ�´�����");System.exit(0);
        default :System.out.println("�治�ң���û�н�Ʒ���´������ɡ�");
      }
    }
  }
}