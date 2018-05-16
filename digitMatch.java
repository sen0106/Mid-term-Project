import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class digitMatch {
	private int count = 0;
	public int digitMatch(int a, int b) throws IllegalArgumentException{
		if(a < 0 || b < 0) {
			throw new IllegalArgumentException();
		}else if(a % 10 == b % 10) {
			count++;
		}
		
		if(a/10 != 0 && b/10 != 0) {
			digitMatch(a/10, b/10);		//recursion
		}else if(a/10 == 0 || b/10 == 0) {
			return count;
		}else {
			throw new IllegalArgumentException();
		}
		
		return count;
	}
	
	@Test
	void test1() {
		digitMatch d1 = new digitMatch();
		assertTrue(d1.digitMatch(38, 34) == 1);
		
		digitMatch d2 = new digitMatch();
		assertTrue(d2.digitMatch(892, 892) == 3);
		
		digitMatch d3 = new digitMatch();
		assertTrue(d3.digitMatch(380, 0) == 1);
		
		digitMatch d4 = new digitMatch();
		assertTrue(d4.digitMatch(1234567, 67) == 2);
	}
	

}
