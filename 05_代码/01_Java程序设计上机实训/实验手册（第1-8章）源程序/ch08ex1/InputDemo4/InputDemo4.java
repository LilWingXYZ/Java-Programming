import javax.swing.JOptionPane;

public class InputDemo4{
  String str = "����֮���ǣ�";
  float number1,number2;
  public InputDemo4(){
    number1 = Float.parseFloat(JOptionPane.showInputDialog("������һ��ʵ����"));    
    number2 = Float.parseFloat(JOptionPane.showInputDialog("������һ��ʵ����"));
    str = str + (number1+number2);
    JOptionPane.showMessageDialog(null,str);
  }
  public static void main(String[] args){
    InputDemo4 ct = new InputDemo4();
    System.exit(0);
  }
}