package javaBasics;

public class Demo4 {
    int sum(int a,char b)
    {
    int res=a+b;
    return res;
    }
	public static void main(String[] args) {
		Demo4 obj=new Demo4();
		int total=obj.sum(100,'m');
		System.out.println(total);

	}

}
