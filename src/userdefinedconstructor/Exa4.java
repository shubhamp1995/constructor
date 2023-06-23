package userdefinedconstructor;

public class Exa4 {
int num3;
int num4;
String fname;

Exa4(int c, int d, String e)
{
	num3=c;
	num4=d;
	fname=e;
}
public void sub() {
	System.out.println("sub of two number is:"+(num3-num4));
	System.out.println(fname);
}

}
