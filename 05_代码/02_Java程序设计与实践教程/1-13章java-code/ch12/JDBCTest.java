import java.sql.*;
public class JDBCTest 
{
	//������main()
	public static void main(String[] args) throws Exception 
	{
   
   	String kongge=new String("     ");
   	//Ϊ����Ľ��������ÿ���
   
   	Class.forName("com.mysql.jdbc.Driver");
   	//����
  	 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest?user=root&password=root");
   
   	/*�������ݿ�,jdbc:mysql://localhost:3306/greatwqs ���ݿ�Ϊgreatwqs���ݿ�
	 * �˿�Ϊ3306
    	* 
    	* �û���user=root
    	* 
    	* �û�����password=greatwqs  
    	*/
   
   	Statement stmt=conn.createStatement();
   	//����SQL���,ʵ�ֶ����ݿ�Ĳ�������
   
   	ResultSet rs=stmt.executeQuery("SELECT   * FROM  person");
   	//���ز�ѯ�Ľ��

        while(rs.next())
   	{
	 System.out.print(rs.getString("id")+kongge);	
	 System.out.print(rs.getString("name")+kongge);
	 System.out.print(rs.getString("gender")+kongge);	
	 System.out.print(rs.getString("major")+kongge);	
	 System.out.print(rs.getString("phone")+kongge);
	 System.out.println();
   	}//��������������
       rs.close();
       stmt.close();
   	conn.close();
   	//�ر����,�����,���ݿ������. }
}
}