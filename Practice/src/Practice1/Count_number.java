package Practice1;

import java.util.List;
import java.util.Vector;

public class Count_number {

	public static void main(String[] args)
	{
		Vector v1=new Vector();
		v1.add("abc");
		v1.add("cde");
		v1.add("efg");
		v1.add(123);
		v1.add(234);
		v1.add(null);
		v1.add(123);
		
		System.out.println(v1);
		
		Vector v2=new Vector();
		v2.add("ghi");
		
		v2.addAll(v1);
		System.out.println(v2);
		
		v2.contains("ghi");
		System.out.println(v2);
		
		v1.equals(v2);
		System.out.println(v1);
		
		System.out.println(v1.isEmpty());
		
		v1.clear();
		System.out.println(v1);
	
		
		
		
		
		
		
		
		
				
	}

}
