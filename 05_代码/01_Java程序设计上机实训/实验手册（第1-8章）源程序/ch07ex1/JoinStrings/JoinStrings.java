public class JoinStrings{
  public static void main(String[] args){
    String firstString = "Many";
    String secondString = "hands ";
    String thirdString = "make light work";

    String myString;
    
    //���´�����������firstString��secondString��thirdString�����ַ���
    myString = firstString + secondString + thirdString;
    System.out.println(myString);

    //���ַ�������ֵ�������ӣ�Ҫע�����ӽ��
    myString = "fifty five is " + 5 + 5;
    System.out.println(myString);
        
    //������ֵ���ַ��������������ַ���������ֵ�к�����
    myString = 5 + 5 + " is ten";
    System.out.println(myString);

    //����String���valueOf()��������ֵת��Ϊ�ַ���
    double a = 3.14;
    String mystr = String.valueOf(a);
    System.out.println(mystr);
  }
}