abstract class Employee{
  public abstract double earnings();
}
class YearWorker extends Employee{
  public double earnings(){
    return 365*50;
  }
}
class MonthWorker extends Employee{
  public double earnings(){
    return 30*50;
  }
}
class WeekWorker extends Employee{
  public double earnings(){
    return 7*50;
  }
}
class Company{
  Employee[] employee;
  double salaries = 0;
  Company(Employee[] employee){
    this.employee = employee;
  }
  public double salariesPay(){
    salaries = 0;
    for(int i=0;i<employee.length;i++){
      salaries += employee[i].earnings();
    }
    return salaries;
  }
}

public class HardWork{
  public static void main(String[] args){
    Employee[] employee = new Employee[20];
    for(int i=0;i<employee.length;i++){
      if(i%3==0){
        employee[i] = new WeekWorker();
      }
      else if(i%3==1){
        employee[i] = new MonthWorker();
      }
      else if(i%3==2){
        employee[i] = new YearWorker();
      }
    }
    Company company = new Company(employee);
    System.out.println("��˾�깤���ܶ�:" + company.salariesPay());
  }
}