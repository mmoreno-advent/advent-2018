package es.m3software.advent2018.day3;

import java.awt.Point;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxAreaCalculator {

	public Integer calculate( List<String> ids ) {

        Stream<Point> points = ids.stream().map( this::parsePoint ); 
		return this.calculate( points );
	}

	private Point parsePoint( String line ) {
        
        String[] parts = line.split(",");
        
        int x = Integer.valueOf(parts[0]);
        int y = Integer.valueOf(parts[1]);
        
        return new Point( x,y );
    }
    
	public Integer calculate( Stream<Point> points ) {
		
        return points.size;
	}

}
