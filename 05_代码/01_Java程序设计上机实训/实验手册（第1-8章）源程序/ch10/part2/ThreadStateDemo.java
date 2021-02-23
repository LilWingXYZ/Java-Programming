package ch10.part2;

import java.io.*;
public class ThreadStateDemo{
	public static void main(String args[]){
		System.out.println("�������߳�!");

		ThreadUseExtends thread1=new ThreadUseExtends();

		//����thread2ʱ��ʵ����Runnable�ӿڵ�ThreadUseRunnable��ʵ��Ϊ����
		Thread thread2 = new Thread(new ThreadUseRunnable(),"SecondThread");

		thread1.start(); //�����߳�thread1ʹ֮���ھ���״̬
		thread1.setPriority(6); //����thread1�����ȼ�Ϊ6
		System.out.println("���߳̽�����7��!");
		try{
 			 Thread.sleep(7000); //���̹߳���7��
		}catch (InterruptedException e){
		  	return;
		}

		System.out.println("�ֻص������߳�!");
		if(thread1.isAlive()){
	  	 thread1.stop(); //���thread1�������������������
	  	System.out.println("thread1���߹���,���߳̽�����thread1������!");
		}else
	 	 System.out.println("���߳�û����thread1,thread1����˳��ִ�н�����!");
 
		thread2.start(); //����thread2
		System.out.println("���߳��ֽ�����7��!");
		try{
	 	 	Thread.sleep(7000); //���̹߳���7��
		}catch (InterruptedException e){
	  		return;
		}

		System.out.println("�ֻص������߳�!");
		if(thread2.isAlive()){
	 		thread2.stop(); //���thread2�������������������
	  		System.out.println("thread2���߹��������߳̽���thread2������!");
		}else
 	 		System.out.println("���߳�û����thread2,thread2����˳��ִ�н�����!");
 	
		System.out.println("������������������!");
		try{
	 		 System.in.read();
		}catch (IOException e){
	  		System.out.println(e.toString());
		}

	}//main
}//MultiThread


class ThreadUseExtends extends Thread{
	ThreadUseExtends() { }  
	public void run(){
  		System.out.println("����Thread������߳�ʵ��!");
  		System.out.println("�ҽ�����10��!");
 		 System.out.println("�ص����߳�,���Ե�,�ղ����̹߳�����ܻ�û�ѹ�����");
 		 try{
  			  sleep(10000); 
  		}catch (InterruptedException e){
  			 return;
  		}
	 }
}


class ThreadUseRunnable  implements Runnable{ //ʵ��Runnable�ӿ�
	ThreadUseRunnable(){}//���캯��
	public void run(){
  		System.out.println("����Thread����߳�ʵ������ʵ����Runnable�ӿڵ���Ϊ����!");
  		System.out.println("�ҽ�����1��!");
 		 System.out.println("�ص����߳�,���Ե�,�ղ����̹߳�����ܻ�û�ѹ�����");
  		try{
    		Thread.sleep(1000); 
 		}catch (InterruptedException e){
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
    		return;
  		}
	}
}
