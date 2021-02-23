package ch11.part1;

import java.net.*;
import java.io.*;
public class URLTest {
	public static void main(String[] args){
		URL url=null;
		InputStream is;
		try{
    		url=new URL("http://localhost/index.html");
			is=url.openStream();
			int c;
     		try{
				while((c=is.read())!=-1)
					System.out.print((char)c);
			}catch(IOException e){
			}finally{
				is.close();
 			}
		}catch(MalformedURLException e){
  			e.printStackTrace();
 		}catch(IOException e){
     		e.printStackTrace();
 		}
		System.out.println("�ļ���:"+url.getFile());
		System.out.println("������:"+url.getHost());
		System.out.println("�˿ں�:"+url.getPort());
		System.out.println("Э����:"+url.getProtocol());
	}
 }
