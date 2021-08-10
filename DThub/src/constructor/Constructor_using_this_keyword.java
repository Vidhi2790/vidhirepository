package constructor;

public class Constructor_using_this_keyword 
{
public Constructor_using_this_keyword()
{
	this(11,22,33);
	System.out.println("this is default constructor");
}
public Constructor_using_this_keyword(int a)
{
	this();
	System.out.println("this is a one parameterize constructor"); 
}
public Constructor_using_this_keyword(int a ,int b)
{
	this(12,22,33,44);
	System.out.println("this is a two parameterize constructor"); 
}
public Constructor_using_this_keyword(int a ,int b,int c)
{
	System.out.println("this is a three parameterize constructor"); 
}

public Constructor_using_this_keyword(int a ,int b,int c,int d)
{
	this(22);
	System.out.println("this is a four parameterize constructor"); 
}
public static void main(String[] args) {
	Constructor_using_this_keyword cl=new Constructor_using_this_keyword(12,22);
	
}
}
