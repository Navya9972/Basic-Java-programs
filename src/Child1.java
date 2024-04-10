import java.util.*;
public class Child1 {
	public static void main(String args[])
	{
		ArrayList<Base1> b1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter howmany times you have to perform addition");
		int k=sc.nextInt();
		for(int i=0;i<k;i++)
		{
			System.out.println("enter first number");
			int a=sc.nextInt();
			System.out.println("enter second number");
			int b=sc.nextInt();
			b1.add(new Base1(a));
			b1.get(i).add1(a); 
			}
		for(int i=0;i<b1.size();i++)
		{
			System.out.println("In the "+i+"index the sum is: "); 
			System.out.println(b1.get(i).getC()); 
		}
	}

}
