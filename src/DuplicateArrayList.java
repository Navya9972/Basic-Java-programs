import java.util.*;
public class DuplicateArrayList {
	public static void main(String args[]) {

	ArrayList<Integer> arr1 = new ArrayList<>();
	arr1.add(1);
	arr1.add(2);
	arr1.add(3);
	arr1.add(2);
	arr1.add(1);
	arr1.add(1);
	arr1.add(1);
	HashSet<Integer> set = new HashSet<>(arr1);
	arr1.clear();
	arr1.addAll(set);
	System.out.println("Array wth duplicate elements are :" +arr1);
	
}
}
