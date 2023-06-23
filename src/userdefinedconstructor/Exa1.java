package userdefinedconstructor;


public class Exa1 {

	//step 1. declaration of variable
	int num1;
	int num2; // global non-static variable
	
	//  user defined constructor --> provided by user or programmer
	// use1-> initialized global variable
	// use2--> copy or load all members of class into object
	Exa1()
	{
		num1=20;
		num2=30;
	}
	//step 3. usage 
	public void addition() {
		System.out.println(num1+num2);
	}
	public void multiplication() {
		System.out.println(num1*num2);
	}
	public static void main(String[] args) {
		Exa1 E1=new Exa1();
		E1.addition();	
		E1.multiplication();
		Exa2 E2=new Exa2();
		E2.sub();
		}
	
}
