package javaBasics;

public class Demo3 {
  float sum()
  {
	  float a=20.43f;
	  int b=20;
	  float res=a+b;
	  return res;
  }
  public static void main(String[] args) {

	  Demo3 obj=new Demo3();
	  float total=obj.sum();
	  System.out.println("The sum of a and b values are:" + total);
  }
}
