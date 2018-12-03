package es.m3software.advent2018.day3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Point;
import java.util.List;

import org.junit.Test;

public class ClaimTest {

	@Test
	public void test() {
		
		Claim c = new Claim("#123 @ 3,2: 5x4");
		List<Point> points = c.getPoints();
		int n = points.size();
		assertEquals( 20 , n );
		assertEquals( 4 , points.get(0).getX(), 0 );
		assertEquals( 3 , points.get(0).getY(), 0 );
		assertEquals( 8 , points.get(n-1).getX(), 0 );
		assertEquals( "123" , c.getId() );
	}
	
	@Test
	public void solapedTest() {
		
		Claim c1 = new Claim("#1 @ 1,3: 4x4");
		assertTrue( c1.isSolaped( new Claim("#2 @ 3,1: 4x4")) );
		assertFalse( c1.isSolaped( new Claim("#3 @ 5,5: 2x2")) );
	}

}
