package es.m3software.advent2018.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Launcher {

	public static void main(String[] args) {

		if ( (args==null) || (args.length != 1) ) {
			System.out.println("Usage: java -jar file.jar ../path/to/input.txt");
			return;
		}
		
		System.out.println("Input: " + args[0] );
		
		List<String> ids = Launcher.readLines( args[0] );
				
		Integer sol = ( new MaxAreaCalculator()).calculate(ids);
		
		System.out.println("Solution: " + sol.toString());
	}
	
	private static List<String> readLines(String filename) {
		
		try {
			List<String> lines = Files.readAllLines( Paths.get( filename ) );
			return lines;
		} catch (IOException e) {
			System.out.println("Error reading file: " + filename);
			return null;
		}
	}
}
