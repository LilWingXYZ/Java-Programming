public class CarDemo{
  public static void main(String[] args){
    Car myCar = new Car("��ɺ",200f,25f);
    System.out.println("��������:" + myCar.getOwnerName());
    System.out.println("��ǰ����:" + myCar.getCurSpeed());
    System.out.println("��ǰת��Ƕ�:" + myCar.getCurDirInDegree());
    myCar.changeSpeed(80);
    System.out.println("�ڵ���changeSpeed(80)��,���ٱ�Ϊ:" + myCar.getCurSpeed());
    myCar.stop();
    System.out.println("�ڵ���stop()�󣬳��ٱ�Ϊ:" + myCar.getCurSpeed());
  }
}