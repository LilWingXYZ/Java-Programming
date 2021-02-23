interface DiagArea{
  double getDiagonal();
  double getArea();
}
class Rectangle implements DiagArea{
  double w,h;
  Rectangle(double w,double h){
    this.w = w; 
    this.h = h;
  }
  public double getDiagonal(){
    return Math.sqrt(w*w+h*h);
  }
  public double getArea(){
    return w*h;
  }
}

class Square extends Rectangle{
  Square(double x){
    super(x,x); 
  }
  void print(){
    System.out.println("�����α߳�:" + w);
    System.out.println("���������:" + getArea());
    System.out.println("�����ζԽ��߳�:" + getDiagonal());
  } 
}

public class ShapeDemo{
  public static void main(String[] args){
    Square s = new Square(2);
    s.print();
  }
}