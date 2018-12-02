package es.m3software.advent2018.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FrecuencyCalibrator {
	
	public Integer calibrateStr( Integer initial, List<String> strChanges) {
		
		List<Integer> changes = strChanges.stream().map(Integer::parseInt).collect(Collectors.toList());
		
		return this.calibrate(initial, changes);
	}

	public Integer calibrate( Integer initial, List<Integer> changes) {
		
		Integer feq = initial;
		List<Integer> feqFounds = new ArrayList<Integer>(); 
		
		int i = 0;
		while ( true ) {
			System.out.println("Comienza el pase " + i++);
			for (Integer change : changes) {
				feq = feq + change;
				if ( feqFounds.contains(feq) ) {
					return feq;
				} else {
					feqFounds.add(feq);
				}
			}
		}
	}

}
