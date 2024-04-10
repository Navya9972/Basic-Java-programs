import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDuplicates 
{
	    public static void main(String[] args) 
	    {
	    ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(1,2,1,2,3,4,3));
	    ArrayList<Integer> Dup=new ArrayList<Integer>();

	    for(int element:arr) {
	        if(!Dup.contains(element)) {
	            Dup.add(element);
	    }
	}
	    System.out.println(Dup);
	}
	    }

	 
