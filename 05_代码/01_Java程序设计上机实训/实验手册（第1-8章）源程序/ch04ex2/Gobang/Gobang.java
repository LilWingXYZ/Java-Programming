//����
import java.io.*;
import java.util.*;

public class Gobang
{
  private String board[][];
  private static int BOARD_SIZE = 15;
  public void initBoard()
  {
    board = new String[BOARD_SIZE][BOARD_SIZE];
    for(int i=0;i<BOARD_SIZE;i++)
    {
      for(int j=0;j<BOARD_SIZE;j++)
        board[i][j] = "��";
    }
  }
  public void printBoard()
  {
    for(int i=0;i<BOARD_SIZE;i++)
    {
      for(int j=0;j<BOARD_SIZE;j++)
        System.out.print(board[i][j]);
    }
    System.out.println();
  }
  public static void main(String[] args)
  {
    Gobang gb = new Gobang();
    Random rand = new Random();
    gb.initBoard();
    gb.printBoard();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String inputStr = null;
    br.readLine();   //��ʲô�ã�
    while((inputStr = br.readLine())!=null)
    {
      String[] posStrArr = inputStr.split(",");
      int xPos = Integer.parseInt(posStrArr[0]);
      int yPos = Integer.parseInt(posStrArr[1]);
      gb.board[xPos-1][yPos-1] = "��";
      /*
      ������������������������Ϊ�������������꣬����board����
      ���漰��
      1.�������Ч�ԣ�ֻ�������֣����ܳ������̷�Χ
      2.�������ĵ��Ѿ������ˣ������ظ�����
      3.ÿ���������Ҫɨ��˭Ӯ��
      */
      gb.printBoard();
      System.out.println("����������������꣬Ӧ��x,y�ĸ�ʽ��");
      gb.printBoard();
      System.out.println("����������������꣬Ӧ��x,y�ĸ�ʽ��");
    }
  }
}