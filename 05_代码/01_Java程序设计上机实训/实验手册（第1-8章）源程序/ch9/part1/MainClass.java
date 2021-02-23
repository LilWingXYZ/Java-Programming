package ch9.part1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

 class Teacher{
  	int numberOne,numberTwo;
   	String operator="";
   	boolean right;
   	public int giveNumberOne(int n) {
     	numberOne=(int)(Math.random()*n);  //����n���ڵ�����
      	return numberOne;
   	}

   	public int giveNumberTwo(int n) {
     	numberTwo=(int)(Math.random()*n);  //����n���ڵ�����
      	return numberTwo;
   	}
   	public String giveOperator(){
     	double d=Math.random();  //���������
      	if(d>=0.5)
         	operator="+";
      	else
         	operator="-";  
      	return operator; 
   	}
	public boolean getRight(int answer) {
     	if(operator.equals("+")){  //�ж�operator�Ƿ��ǡ�+����
        	if(answer==numberOne+numberTwo)  
            	right=true;
          	else
            	right=false;
       	}
      	else if(operator.equals("-")){ //�ж�operator�Ƿ��ǡ�-����
        	if(answer==numberOne-numberTwo)  
            	right=true;
          	else
            	right=false;
       	}
      	return right; 
   	}
}

 class ComputerFrame extends Frame implements ActionListener{
  	TextField textOne,textTwo,textResult;
   	Button getProblem,giveAnwser;
   	Label operatorLabel,message;
   	Teacher teacher;
   	ComputerFrame(String s) {
     	super(s);
      	teacher=new Teacher();
      	setLayout(new FlowLayout());
      	textOne=new TextField(10); //����textOne,��ɼ��ַ�����10
      	textTwo=new TextField(10); //����textTwo,��ɼ��ַ�����10 
      	textResult=new TextField(10); //����textResult,��ɼ��ַ�����10
     	operatorLabel=new Label("+");
      	message=new Label("�㻹û�лش���");
      	getProblem=new Button("��ȡ��Ŀ");
      	giveAnwser=new Button("ȷ�ϴ�");
      	add(getProblem); 
      	add(textOne);
      	add(operatorLabel);
      	add(textTwo);
      	add(new Label("="));
      	add(textResult);
     	add(giveAnwser); 
    	add(message);
   	textResult.requestFocus();
   	textOne.setEditable(false);
    	textTwo.setEditable(false);
		//����ǰ����ע��ΪgetProblem��ActionEvent�¼�������   
		getProblem.addActionListener(this);  
		//����ǰ����ע��ΪgiveAnwser��ActionEvent�¼�������
		giveAnwser.addActionListener(this);
  	//����ǰ����ע��ΪtextResult��ActionEvent�¼�������
   	    textResult.addActionListener(this);
   	setBounds(100,100,450,100);
    	this.setVisible(true); //���ÿɼ���
     	validate();
        addWindowListener(new WindowAdapter(){
           	public void windowClosing(WindowEvent e) {
         		System.exit(0); //�˳����
         	}
          }
       );
    }

    public void actionPerformed(ActionEvent e) {
    	 if(e.getSource()==getProblem){ //�ж��¼�Դ�Ƿ���getProblem
     	  	int number1=teacher.giveNumberOne(100);
   			int number2=teacher.giveNumberTwo(100);
    		String operator=teacher.giveOperator();
   			textOne.setText(""+number1);
    	  	textTwo.setText(""+number2); 
    	 	operatorLabel.setText(operator); 
   		 	message.setText("��ش�");
			textResult.setText(null); 
		}
    	 if(e.getSource()==giveAnwser){ //�ж��¼�Դ�Ƿ���giveAnwser 
       		String answer=textResult.getText();
          	try{ 
               	int result=Integer.parseInt(answer); 
               	if(teacher.getRight(result)==true) {
                	message.setText("��ش���ȷ");
               	}
               else{
                	message.setText("��ش����");
               }
     		}
          	catch(NumberFormatException ex) {
               	message.setText("�����������ַ�");
             }
       	}
      	textResult.requestFocus();
      	validate(); 
   	}
} 


public class MainClass{
	public static void main(String args[]){
   		ComputerFrame frame;
     	frame=new ComputerFrame("��������");  //�������ڣ������Ϊ����������   
  	}
}
