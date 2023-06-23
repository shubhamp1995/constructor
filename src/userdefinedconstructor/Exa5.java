package userdefinedconstructor;

public class Exa5 {
int num1;
int num2;
// with zero parameter
Exa5()
{
	num1=100;
	num2=200;
}
// with paramter
Exa5(int a, int b)
{
	num1=a;
	num2=b;
}
public void add() {
	System.out.println("addition of two number="+" "+(num1+num2));
}
public void multi() {
	System.out.println("multiplication of two number="+" "+(num1*num2));
}
	public void sub() {
		System.out.println("subtraction of two number="+" "+(num1-num2) );
	}
	public static void main(String[] args) {
		Exa5 E5=new Exa5();
		E5.add();
		System.out.println("--------------------");
		Exa5 E6=new Exa5(20,40);
		E6.add();
		System.out.println("--------------------");
		Exa5 E7=new Exa5();
		E7.multi();
		System.out.println("--------------------");
		Exa5 E8=new Exa5(8,9);
		E8.multi();
		System.out.println("--------------------");
		Exa5 E9=new Exa5();
		E9.sub();
		System.out.println("--------------------");
		Exa5 E10=new Exa5(1500, 2000);
		E10.sub();
		System.out.println("--------------------");
		Exa6 E11=new Exa6();
		E11.division();
		System.out.println("--------------------");
		Exa6 E12=new Exa6(40,8);
		E12.division();
	}
}
