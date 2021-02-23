import java.util.Calendar;

class Time{
  private Calendar t;
  private int y,m,d,hh,mm,ss;
  Time(){
    t = Calendar.getInstance();
    y = t.get(t.YEAR);
    m = t.get(t.MONTH)+1;
    d = t.get(t.DATE);
    hh = t.get(t.HOUR_OF_DAY);
    mm = t.get(t.MINUTE);
    ss = t.get(t.SECOND);
  }
  public String getDate(){
    return (y + "��" + m + "��" + d + "��");
  }
  public String getTime(){
    return (hh + "ʱ" + mm + "��" + ss + "��");
  }
}

public class TimeDemo{
  public static void main(String args[]){
    Time t = new Time();
    System.out.println("��ǰ����:" + t.getDate());
    System.out.println("��ǰʱ��:" + t.getTime());
  }
}