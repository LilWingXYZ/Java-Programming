public class DegreeDemo
{
  public static void main(String[] args)
  {
    int c = 38;
    switch(c<10?1:c<25?2:c<35?3:4)
    {
      case 1:System.out.println(" " + c + "���е��䣬Ҫ�ഩ�·���");break;
      case 2:System.out.println(" " + c + "�������ʣ���ȥ���");break;
      case 3:System.out.println(" " + c + "���е���");break;
      default:System.out.println(" " + c + "��̫���ˣ����յ���");break;
    } 
  }
}