package userdefinedconstructor;

public class Exa8 {
int num1;
int num2;
int num3;
double num4=(double)(num1+num2)/num3*100;

Exa8(int a, int b,  int d)
{
	num1=a;
	num2=b;
	num3=d;
}
public void data() 
{
	System.out.println(num4);
}
public static void main(String[] args) 
{
	Exa8 E8=new Exa8(45,40,100);
	E8.data();
}
}
