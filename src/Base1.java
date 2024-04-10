
public class Base1 {
	
	private int a;
	private int b=10;
	private int c;
	public Base1(int a)
	{
		this.a=a;
		}
	public int getA() 
	{
		return a;
		}
	   public void setA(int a)
	   {
		this.a = a ;
	   }
	    
	    public int getC() 
		{
			return c;
		}
		public void setC(int c)
		{
			this.c = c;
		}
		public void add1(int b)
		{
			c=this.b+b;setC(c);
		}
}
