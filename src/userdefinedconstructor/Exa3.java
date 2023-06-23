package userdefinedconstructor;

public class Exa3 {
//user defined constructor with parameter
	// declaration
	int num1;
	int num2;
	Float f;
//	step 2. initialization
//	user defined constructor with int , int parameter
//	use 1--> to initialize global variable
//	use2--> to copy/load all members of class into object
	Exa3(int a, int b, float n)
	{
	num1=a;  // assigning local variable to global variable
	num2=b;
	f=n;
	}
//	step 3-> usage
	public void add() {
		System.out.println("addition of two number:"+(num1+num2)+"\n"+f+"%");
	}
	public void multi() {
		System.out.println("multiplication of two number:"+(num1*num2)+"\n"+f+"%");
		
	}
	public void y1() {
		System.out.println("float is:"+f+"%");
	}
	
	public static void main(String[] args) {
		Exa3 E3=new Exa3(10, 20, 98.5f);
				E3.add();
				E3.multi();
				Exa3 E7=new Exa3(10, 20, 98.5f);
				E7.y1();
				
				System.out.println("----------------------------");
				Exa3 E4=new Exa3(30, 40, 78.4f);
						E4.multi();
				Exa4 E5=new Exa4(50,200, "shubham");
						E5.sub();
						
	}
}

