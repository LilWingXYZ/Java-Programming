class MaxArray{
  int findmax(int a[]){
    int max = a[0];
    for(int i=0;i<a.length;i++){
      if(max<a[i]){
        max = a[i];
      }
    }
  return max;
  }
}

public class MaxDemo{
  public static void main(String[] args){
    MaxArray ob = new MaxArray();
    int a[] = {2,5,7,3,18,9},b[] = {33,43,6,12,8};
    System.out.println("����a�е����ֵ��" + ob.findmax(a));
    System.out.println("����b�е����ֵ��" + ob.findmax(b));
  }
}