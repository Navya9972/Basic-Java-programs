import java.util.HashMap;
public class HashMap3 {

	public static void main(String[] arg)   
	{   
	HashMap<String, String> map = new HashMap<String, String>();   
	map.put("Sumit",  "Singh");  
	map.put("Devesh", "Mishra");   
	map.put("Rahul", "Tiwari");   
	for (String name: map.keySet())         //iteration over keys  
	{  
	//returns the value to which specified key is mapped  
	String lastname=map.get(name);   
	System.out.println("Key: " + name + ", Value: " + lastname);   
	}   
	}  
	}  

