import javax.swing.JOptionPane;
import java.util.Scanner;

public class InputDemo3{
  String str = "����֮���ǣ�";
  float number1,number2;
  Scanner sc;
  public InputDemo3(){
    System.out.println("����������ʵ����");
    sc = new Scanner(System.in);
    number1 = sc.nextFloat();
    number2 = sc.nextFloat();
    str = str + (number1+number2);
    JOptionPane.showMessageDialog(null,str);
  }
  public static void main(String[] args){
    InputDemo3 ct = new InputDemo3();
    System.exit(0);
  }
}