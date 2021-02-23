import java.util.*;

public class CalendarDemo{
  public static void main(String[] args){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    //������������~������ ��Ӧ�����ֶ�ֵΪ��1~7��
    //�·���1~12 ��Ӧ�����ֶ�ֵΪ0~11
    String year = String.valueOf(calendar.get(Calendar.YEAR)),
           month = String.valueOf(calendar.get(Calendar.MONTH)+1),
           day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)),
           week = String.valueOf(calendar.get(Calendar.DAY_OF_WEEK)-1);
    int hour = calendar.get(Calendar.HOUR_OF_DAY),
        minute = calendar.get(Calendar.MINUTE),
        second = calendar.get(Calendar.SECOND);
    System.out.println("���ڵ�ʱ���ǣ�");
    System.out.println(" " + year + "��" + month + "��" + day + "��" + "����" + week);
    System.out.println(" " + hour + "ʱ" + minute + "��" + second +"��");
    calendar.set(1962,5,29);
    long time1962 = calendar.getTimeInMillis();//public long getTimeInMillis() ���ش�Calendar��ʱ��ֵ���Ժ���Ϊ��λ
    calendar.set(2006,9,1);
    long time2006 = calendar.getTimeInMillis();
    long ������� = (time2006-time1962)/(1000*60*60*24);
    System.out.println("2006��10��1�պ�1962��6��29�����" + ������� + "��");
  }
}