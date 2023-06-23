package userdefinedconstructor;

public class Exa6 {
int num3;
int num4;

Exa6()
{
	num3=500;
	num4=25;
}
Exa6(int c, int d)
{
	num3=c;
	num4=d;
}
public void division() {
	System.out.println(num3/num4);
}

}
