package userdefinedconstructor;

public class ConstrChaining 
{
int num1;
int num2;
int num3;

ConstrChaining()
{
	num1=10;
	num2=20;
	System.out.println(num1+num2);
}
ConstrChaining(int a,int b)
{
	this();
	num1=a;
	num2=b;
	System.out.println(a+b);
	
}
ConstrChaining(int a,int b,int c)
{
	this(25,25);
	num1=a;
	num2=b;
	num3=c;
	System.out.println(a+b+c);
}
public static void main(String[] args)
{
	ConstrChaining c1=new ConstrChaining(100,200,300);	
}



















}
