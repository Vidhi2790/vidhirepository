package assignment1;

public class Student {
	int age=29;
	int rollno=212;
	public void method()
	{
		System.out.println("Welcome all");
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Student su=new Student();
		su.method();
		System.out.println(su.age);
		System.out.println(su.rollno);
	}

}
