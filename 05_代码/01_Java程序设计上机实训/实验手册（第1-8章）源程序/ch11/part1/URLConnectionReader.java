package ch11.part1;

import java.net.*;
import java.io.*;
public class URLConnectionReader {
	public static void main(String[] args) throws Exception {
		URL web = new URL("http://www.sohu.com/");
		URLConnection webc=web.openConnection();    
 		//get an instance of URLConnection
         BufferedReader in = new BufferedReader(new InputStreamReader(
                          webc.getInputStream()));           
		//use of URLConnection
         String inputLine;
		//����ȡ�����ݸ�ֵ��inputLine�������䲻Ϊ��ʱ
         while ((inputLine=in.readLine())!=null)
	System.out.println(inputLine);
         in.close(); //�رն�ȡ��
	}
 }

