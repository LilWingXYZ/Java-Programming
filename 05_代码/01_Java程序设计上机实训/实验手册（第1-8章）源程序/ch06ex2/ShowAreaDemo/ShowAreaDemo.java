abstract class Shape{
  abstract void showArea();
}

class Rectangle extends Shape{
  double w,h;
  Rectangle(double w,double h){
    this.w = w;
    this.h = h;
  }
  void showArea(){
    System.out.println("���������Ϊ:" + w*h);
  }
}

class Square extends Shape{
  double x;
  Square(double x){
    this.x = x;
  }
  void showArea(){
    System.out.println("���������Ϊ:" + x*x);
  }
}

class Circle extends Shape{
  double r;
  Circle(double r){
    this.r = r;
  }
  void showArea(){
    System.out.println("Բ�����Ϊ:" + 3.14*r*r);
  }
}

public class ShowAreaDemo{
  public static void main(String[] args){
    Rectangle r = new Rectangle(3,5);
    Square s = new Square(2);
    Circle c = new Circle(2);
    r.showArea();
    s.showArea();
    c.showArea();
  }
}