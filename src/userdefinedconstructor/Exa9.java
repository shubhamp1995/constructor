package userdefinedconstructor;

public class Exa9 
{
int num1;
int num2;

Exa9()
{
	num1=10;
	num2=20;
}
public void add()
{
System.out.println(num1+num2);	
}
public void multi()
{
System.out.println(num1*num2);	
}
public static void main(String[] args) 
{
Exa9 nine=new Exa9();
nine.add();
nine.multi();
Exa10 ten=new Exa10();
ten.sub();
}

}
