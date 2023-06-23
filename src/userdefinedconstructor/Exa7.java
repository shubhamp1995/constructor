package userdefinedconstructor;

public class Exa7 {
int no1;//400
int no2;//450
double no3;//1000  //float


String studentname;
float per;
Exa7()
{
	no1=300;
	no2=500;
    per=(float)98.4;
    studentname="shubham petkar";
}
// user defined constructor with paramter
Exa7(int a, int b, float c ,String fullname)
{
	no1=a;
	no2=b;
	no3=c;

	studentname=fullname;         ///(a+b/c)*100=85%
}
public void pre() {
	System.out.println("name = "+" "+studentname+"\n"+"pre  marks="+" "+(no1+no2)+"\n"+"percentage="+" "+per+"%");
}
public void main() {
	System.out.println("name = "+" "+studentname+"\n"+"mains marks = "+(no1+no2)+"\n"+"percentage = "+(no1+no2)/no3*100+"%");
}
public static void main(String[] args) {
	System.out.println("Ibps Final result:-"+"\n");
	
	Exa7 E7=new Exa7( );
			E7.pre();
			System.out.println("--------------------------");
			Exa7 E8=new Exa7( 400,450,1000,"shubham petkar");
			E8.main();
			System.out.println("\n"+"congratulation you have been selected for provisional interview");
}
}
