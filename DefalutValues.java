
public class DefalutValues {
static int a;// by static without Objects
static double b;// by static without Objects
long c;
byte d;
char h;

String t;
 

void print()
{
	
	
	System.out.println(c);
	System.out.println(d);
	System.out.println(h);
	System.out.println(t);
}
public static void main(String[] args) {
	System.out.println(a); 
	System.out.println(b);
	DefalutValues f=new DefalutValues();
	f.print();
	
}
}
