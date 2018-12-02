package es.m3software.advent2018.day1;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Launcher {

	public static void main(String[] args) {

		if ( (args==null) || (args.length != 1) ) {
			System.out.println("Usage: java -jar file.jar ../path/to/input.txt");
			return;
		}
		
		System.out.println("Input: " + args[0] );
		
		List<String> strChanges = Launcher.readLines( args[0] );
		
		Integer sol = ( new FrecuencyCalibrator()).calibrate( new Integer(0), strChanges );
		
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
