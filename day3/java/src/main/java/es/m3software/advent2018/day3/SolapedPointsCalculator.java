package es.m3software.advent2018.day3;

import java.awt.Point;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SolapedPointsCalculator {

	public Integer calculate( List<String> ids ) {

		return this.calculateStreams(ids);
	}

	
	public Integer calculateList( List<String> ids) {
		
		HashMap<Point, Integer> usedPoints = new HashMap<Point, Integer>();
		int solaped = 0;

		for (String full : ids) {
			
			List<Point> points = (new Claim( full )).getPoints();
			
			System.out.println("Procesando: " + full + " " + points.size() + " points");
			
			for (Point point : points) {
				Integer n = usedPoints.get(point);
				if ( n == null ) {
					usedPoints.put(point, 1);
				} else if ( n.equals(1) ) {
					usedPoints.put(point, 2);
					solaped++;
				}
			}
		}
		return solaped;
	}

	public Integer calculateStreams( List<String> ids) {
		
		long num = ids.stream().map( x -> new Claim(x))
							   .flatMap( x -> x.getPoints().stream())
							   .collect( Collectors.groupingBy( x -> x
									          				  , Collectors.counting() ))
							   .values().stream().filter( x -> x > 1 )
							   .count();
		
		return Long.valueOf(num).intValue();
		
	}
}
