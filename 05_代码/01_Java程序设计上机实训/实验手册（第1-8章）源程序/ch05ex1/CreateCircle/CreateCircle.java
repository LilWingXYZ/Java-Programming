class Circle{
  static double cr;
  final double PI = 3.142;
  public double perimeter(double r){
    cr = r;
    return (2*PI*cr);
  }
  public double area(double r){
    cr = r;
    return (PI*cr*cr);
  }
}

public class CreateCircle{
  public static void main(String[] args){
    double r = 2;
    double c_Perimeter;
    double c_Area;
    Circle c = new Circle();
    c_Perimeter = c.perimeter(r);
    c_Area = c.area(r);

    System.out.println("�뾶Ϊ2��Բ�ܳ�:" + c_Perimeter);
    System.out.println("�뾶Ϊ2��Բ���:" + c_Area);
  }
}