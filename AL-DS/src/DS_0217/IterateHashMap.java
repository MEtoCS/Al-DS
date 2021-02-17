package DS_0217;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("AAA", 200);
		map.put("CCC", 100);
		map.put("DDD", 500);
		map.put("BBB", 700);
		
		Set entrySet = map.entrySet();		
		Iterator it = entrySet.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>)it.next();
			System.out.println("Key: "+e.getKey() + " value: " + e.getValue());
		}
		System.out.println("==================================");
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println("Key: "+e.getKey() + " value: " + e.getValue());
		}
	}

}
