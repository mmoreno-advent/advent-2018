package es.m3software.advent2018.day3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SolapedPointsCalculatorTest {
	
	private ArrayList<String> ids = new ArrayList<String>();
	
	@Before
	public void setUp() throws Exception {
		this.ids.add("#1 @ 1,3: 4x4");
		this.ids.add("#2 @ 3,1: 4x4");
		this.ids.add("#3 @ 5,5: 2x2");
	}

	@Test
	public void test() {
		
		SolapedPointsCalculator calc = new SolapedPointsCalculator();

		int n = calc.calculate(this.ids);
		assertEquals( 4 , n ) ;
	}
	
	@Test
	public void testStream() {
		
		SolapedPointsCalculator calc = new SolapedPointsCalculator();
		
		int n = calc.calculateStreams(this.ids);
		assertEquals( 4 , n ) ;
	}

}
