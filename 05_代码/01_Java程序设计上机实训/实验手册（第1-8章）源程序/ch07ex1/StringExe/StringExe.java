import javax.swing.JOptionPane;

public class StringExe{
  public static void main(String[] args){
    String s1,s2,s3,s4,output;
    s1 = new String("����!");
    s2 = new String("�ټ�!");
    s3 = new String("ף������!");
    s4 = new String("ף������!");
    output = "s1 = " + s1 + "\ns2 =" + s2 + "\ns3 = " + s3 + "\ns4 = " + s4 + "\n\n";
    //
    if(s1.equals("����!"))
      output += "s1��������\"����!\"\n";
    else
      output += "s1����\"����!\"\n";
    //
    if(s1 == "����!")
      output += "s1���õ�ַͬ��\"����!\"\n";
    else
      output += "s1���õ�ַ��ͬ��\"����!\"\n";
    //
    if(s3.equalsIgnoreCase(s4))
      output += "s3����ͬ��s4\n";
    else
      output += "s3����ͬ��s4\n";
    //
    output += "\ns1.compareTo(s2) is " + s1.compareTo(s2) + 
              "\ns2.compareTo(s1) is " + s2.compareTo(s1) + 
              "\ns1.compareTo(s1) is " + s1.compareTo(s1) +              "\ns3.compareTo(s4) is " + s3.compareTo(s4) + 
              "\ns4.compareTo(s3) is " + s4.compareTo(s3) +  
              "\n\n"; 
    if(s3.regionMatches(0,s4,0,5))
      output += "s3��s4ǰ5���ַ�ƥ��\n";
    else
      output += "s3��s4ǰ5���ַ���ƥ��\n";
    JOptionPane.showMessageDialog(null,output,"��ʾ�ַ�����ù��췽��",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }
}