package gitDemo;

public class Variable_study {

	public static void main(String[] args) {
		
		secondmthd();
		System.out.println("calling static variable");
		int c=10+n;
		System.out.println("C= "+c);
        
		Variable_study v=new Variable_study();
		v.firstmthd();
		System.out.println("calling non static variable");
		int d=4+v.a;
		System.out.println("d= "+d);
	
	     System.out.println("variables from diff class");
	     clsforVariable v1=new clsforVariable();
	     int f=5+v1.r;                                     //non static variaaable from another class
	     System.out.println("f= "+f);
	 
	     System.out.println("static variable from other class = "+clsforVariable.b);
	}
	
	public void firstmthd()
	{
		System.out.println("running non static method");
	}
	public static void secondmthd()
	{
		System.out.println("Running static method");
	}
	public int a=10;   // non static variable 
	public static int n=32; //static variable 
}
