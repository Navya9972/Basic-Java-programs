import java.util.*;
public class Collection {
		public static void main(String args[])
		{
			HashMap<String,Object> names=new HashMap<>();
			names.put("ramesh", 23);
			names.put("ganesh","reske");
			names.put("rkdj", "34.3");
			HashMap<String,Object> name=new HashMap<>();
			name.put("ejn", 38);
			name.putAll(names);//Adding another object
			names.get("ramesh");
			names.clear();
			for(Map.Entry <String,Object>m:names.entrySet())
			{
				System.out.println(m.getKey()+ ":"+m.getValue());
}
		}

}
