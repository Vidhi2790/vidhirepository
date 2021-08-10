package method;

public class Method_using_this_keyword {

	public void m1(int a)
	{
		System.out.println("this is 1 parameterized method");
	}
	public void m2(int a,int b)
	{
		
		System.out.println("this is 2 parameterized method");
	}
	public void m3(int a,int b,int c)
	{
		System.out.println("this is 3 parameterized method");
	}
	public void m4(int a,int b,int c,int d)
	{
		System.out.println("this is 4 parameterized method");
		this.m1(11);
		this.m3(11, 22, 33);
		this.m2(11, 22);
	}
	public static void main(String[] args) 
	{
		Method_using_this_keyword ob1=new Method_using_this_keyword();
		ob1.m4(11, 22,33,44);
	}
}
