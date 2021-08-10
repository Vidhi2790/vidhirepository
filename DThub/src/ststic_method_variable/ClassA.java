package ststic_method_variable;

public class ClassA {

	static int a;
	public static void TC1()
	{
		a=a+1;
	}
	public static void main(String[] args) 
	{
	ClassA.TC1();
	System.out.println(ClassA.a);
	}
}
