package defaultconstructor;

public class Exa1 {
//	 Exa1-> default constructor
	
//	 default constructor--> provided by complier
//	 use to copy all the members of class into the object
//	 Exa1()
//	{
//		
//	}
//	
	
	
public static void main(String[] args) {
	y1();
	Exa1 e1=new Exa1();
	e1.y2();
	System.out.println("------------------------------");
	Exa2 e2=new Exa2();
	e2.y3();
	e2.y3();
}
public static void y1()
{
	System.out.println("running static method y1");
}
public void y2() 
	{
		System.out.println("running non-static method y2");
	}

}
