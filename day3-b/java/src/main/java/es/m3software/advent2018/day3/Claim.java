package es.m3software.advent2018.day3;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Claim {

	private String id;
	private int left;
	private int top;
	private int width;
	private int heigth;
	
	public Claim(String full) {
		
		String[] parts = full.split(" ");
		
		this.id = parts[0].split("#")[1];
		
		String[] margins = parts[2].split(",");
		this.left = Integer.parseInt(margins[0]);
		this.top = Integer.parseInt(margins[1].split(":")[0]);
		
		String[] sizes = parts[3].split("x");
		this.width = Integer.parseInt(sizes[0]);
		this.heigth = Integer.parseInt(sizes[1]);
	}
	
	public String getId() {
		return id;
	}

	public List<Point> getPoints( ) {
		
		ArrayList<Point> points = new ArrayList<Point>();
		
		for (int j = 0; j < this.heigth; j++) {
			for (int i = 0; i < this.width; i++) {
				points.add( new Point( this.left + 1 + i, this.top + 1 + j ));
			}
		}
		return points;
	}
	
	public boolean isSolaped( Claim c ) {
		
		if ( ( this.left + this.width  >= c.left + 1 ) && ( this.left + 1 <= c.left + c.width )
		  && ( this.top + this.heigth  >= c.top + 1 ) && ( this.top + 1 <= c.top + c.heigth )) {
			return true;
		}
		return false;
	}
	
}
