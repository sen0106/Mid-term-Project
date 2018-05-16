import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

import org.junit.jupiter.api.Test;

class maxOccurrences {
	public static int maxOccurrences(List<Integer> list) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    Iterator<Integer> i = list.iterator();
	    
	    while (i.hasNext()) {
	        int n = i.next();
	        if (map.containsKey(n)) {
	            map.put(n, map.get(n) + 1);
	        } else {
	            map.put(n, 1);
	        }
	    }
	    
	    Set<Integer> setKey = map.keySet();
	    i = setKey.iterator();
	    int max = 0;
	    
	    while(i.hasNext()) {
	        int current = map.get(i.next());
	        if (current > max) {
	            max = current;
	        }
	    }
	    
	    return max;
	}
	
	@Test
	void test() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		assertTrue(maxOccurrences(list1) == 2);	
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(8);
		list2.add(2);
		list2.add(3);
		list2.add(8);
		list2.add(8);
		assertTrue(maxOccurrences(list2) == 3);
	}
}
