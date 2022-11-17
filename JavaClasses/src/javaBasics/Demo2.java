package javaBasics;


public class Demo2 {
    public void sum(int a,int b)
    {
    	int res=a+b;
    	System.out.println(res);
    }
    public static void main(String[] args) {
    	Demo2 obj=new Demo2();
    	obj.sum(10,30);
    	obj.sum(1,2);
    }
}
