package userdefinedconstructor;

public class ConstructorChaining 
{
int num1;
int num2;
int num3;

ConstructorChaining()
{
	num1=32;
	num2=54;
	System.out.println(num1+num2);
	
}
ConstructorChaining(int a,int b)
{
	this();
	num1=a;
	num2=b;
	System.out.println(a+b);
}
ConstructorChaining(int a,int b,int c)
{
	this(40,50);
	num1=a;
	num2=b;
	num3=c;
	System.out.println(a+b+c);
}
public static void main(String[] args) 
{
	ConstructorChaining c=new ConstructorChaining(10,20,30);	
}
}
