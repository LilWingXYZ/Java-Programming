package ch10.part1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class WordThread extends Thread{
	char word;
	int k=19968;
	Label com; 

	WordThread(Label com) {

		this.com=com;

	}  

    public void run(){
      	k=19968;
       	while(true) {
       		word=(char)k;
          	com.setText(""+word);
          	try{  
				sleep(6000);//����sleep����ʹ���߳��ж�6000����
             }
          	catch(InterruptedException e){}
           	k++;
         	 if(k>=29968)
				 k=19968;
        }
    } 
}

 class ThreadFrame extends Frame implements ActionListener{
  	Label  wordLabel;
  	Button button;
  	TextField inputText,scoreText;
 	WordThread giveWord;//��WordThread����һ��giveWord���� 
  	int score=0;
  	ThreadFrame(){
    	wordLabel=new Label(" ",Label.CENTER);
     	wordLabel.setFont(new Font("",Font.BOLD,72));
     	button=new Button("��ʼ");
     	inputText=new TextField(3);
     	scoreText=new TextField(5);
    	scoreText.setEditable(false); 
		//����giveWord����wordLabel���ݸ�WordThread���췽���Ĳ���
    	giveWord=new WordThread(wordLabel);
     	button.addActionListener(this);
    	inputText.addActionListener(this);
	    add(button,BorderLayout.NORTH);
		add(wordLabel,BorderLayout.CENTER);
     	Panel southP=new Panel();
     	southP.add(new Label("�����ǩ����ʾ�ĺ��ֺ�س�:"));
     	southP.add(inputText);
     	southP.add(scoreText);
     	add(southP,BorderLayout.SOUTH);
     	setBounds(100,100,350,180);
     	setVisible(true);
     	validate();
     	addWindowListener(new WindowAdapter(){
    		public void windowClosing(WindowEvent e) {
          		System.exit(0);
    		}
     	}
   	);
   } 
  public void actionPerformed(ActionEvent e) {
 		if(e.getSource()==button) {
      		if(!(giveWord.isAlive()))   {  //giveWord���÷���isAlive()
             	giveWord=new WordThread(wordLabel);
        	 }
         	try
         	{   giveWord.start();//giveWord���÷���start()
         	}
         	catch(Exception exe){}
      	}
      	else if(e.getSource()==inputText) {
			if(inputText.getText().equals(wordLabel.getText())){
           		score++;
          	}
         	scoreText.setText("�÷�:"+score);
        	 inputText.setText(null);
      	}
   	}
}

public class Ext1{
	public static void main(String args[]){
   		new ThreadFrame();
   }
}
