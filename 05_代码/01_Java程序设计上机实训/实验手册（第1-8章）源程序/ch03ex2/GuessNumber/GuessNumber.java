import javax.swing.JOptionPane;
public class GuessNumber
{
  public static void main(String[] args)
  {
    System.out.println("����һ��1~100֮�����������²������");
    int realNumber = (int)(Math.random()*100);
    int yourGuess = 0;
    String str = JOptionPane.showInputDialog("������Ĳ²�");
    yourGuess = Integer.parseInt(str);
    while(realNumber!=yourGuess)
    {
      if(realNumber<yourGuess)
      {
        str = JOptionPane.showInputDialog("�´��ˣ���������Ĳ²⣺");
        yourGuess = Integer.parseInt(str);
      }
      else if(realNumber>yourGuess)
      {
        str = JOptionPane.showInputDialog("��С�ˣ���������Ĳ��ԣ�");
        yourGuess = Integer.parseInt(str);
      }
    }
    System.out.println("�¶���!");
  }
}