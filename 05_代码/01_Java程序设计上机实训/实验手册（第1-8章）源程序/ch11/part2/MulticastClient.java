package ch11.part2;import java.io.*;
import java.net.*;
import java.util.*;
public class MulticastClient {
	
	public static void main(String args[]) throws IOException{
	MulticastSocket socket=new MulticastSocket(4446);
	//����4446�˿ڵĹ㲥�׽���
	InetAddress address=InetAddress.getByName("230.0.0.1"); //�õ�230.0.0.1�ĵ�ַ��Ϣ
		socket.joinGroup(address); //ʹ��joinGroup()���㲥�׽��ְ󶨵���ַ��
		DatagramPacket packet;
		for(int i=0;i<5;i++) {
			byte[] buf=new byte[256]; //����������
			packet=new DatagramPacket(buf,buf.length); //�����������ݱ�
			socket.receive(packet); //����
			String received=new String(packet.getData()); 
			//�ɽ��յ������ݱ��õ��ֽ����飬���ɴ˹���һ��String����
			System.out.println("Quote of theMoment:"+received); 
			} //ѭ��5��
		socket.leaveGroup(address); 
		//�ѹ㲥�׽��ִӵ�ַ�Ͻ����
		socket.close(); //�رչ㲥�׽���
	}
}

