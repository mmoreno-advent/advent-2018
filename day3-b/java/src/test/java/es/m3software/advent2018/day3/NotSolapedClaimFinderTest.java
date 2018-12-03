package es.m3software.advent2018.day3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class NotSolapedClaimFinderTest {
	
	private ArrayList<String> ids = new ArrayList<String>();
	
	@Before
	public void setUp() throws Exception {
		this.ids.add("#1 @ 1,3: 4x4");
		this.ids.add("#2 @ 3,1: 4x4");
		this.ids.add("#3 @ 5,5: 2x2");
	}

	@Test
	public void test() {
		
		NotSolapedClaimFinder calc = new NotSolapedClaimFinder();

		String id = calc.find(this.ids);
		assertEquals( "3" , id ) ;
	}
}
