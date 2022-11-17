package javaBasics;

public class Demo1 
{

	public void sum() {
		int a=10,b=20;
		int res=a+b;
		System.out.println(res);
	}
    static void display()
    {
    	System.out.println("This is display static method");
    }
    public static void main(String[] args) {
    	Demo1 obj=new Demo1();
    	obj.sum();
    	Demo1.display();
    	
    }
}
