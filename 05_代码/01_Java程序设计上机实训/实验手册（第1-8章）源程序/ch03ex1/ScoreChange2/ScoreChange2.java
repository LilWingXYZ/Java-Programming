public class ScoreChange2
{
  public static void main(String[] args)
  {
    int score = 55;
    switch(score/10)
    { 
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:System.out.println(score + "���ǲ�����");break;
      case 6:System.out.println(score + "���Ǽ���");break;
      case 7:System.out.println(score + "�����е�");break;
      case 8:System.out.println(score + "��������");break;
      case 9:
      case 10:System.out.println(score + "��������");break;
      default:System.out.println("���ݴ���");
    }
  }
}