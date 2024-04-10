import java.util.*;
import java.util.Collections;
public class SortingAscending {
 public static void main(String args[])
 {
	 ArrayList<Integer> arr1 = new ArrayList<>();
	 arr1.add(400);
	 arr1.add(700);
	 arr1.add(345);
	 arr1.add(378);
	 arr1.add(123);
	 arr1.add(389);
	 arr1.add(234);
	 arr1.add(155);
//	 System.out.println("Arrays before sorting:"+arr1);
//	 Collections.sort(arr1);
//	 System.out.println("Arrays After sorting:"+arr1);
//	 Collections.sort(arr1,Collections.reverseOrder());
//	 System.out.println("Arrays After  sorting in descending order:"+arr1);
	 Iterator<Integer> it = arr1.iterator();  
	 while (it.hasNext())  
	 {  
	 int i = it.next();  
	 System.out.println(i);  
	   
	 
	 
	 }
 }
}
