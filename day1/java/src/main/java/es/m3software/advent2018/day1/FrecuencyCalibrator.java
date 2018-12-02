package es.m3software.advent2018.day1;

import java.util.List;
import java.util.stream.IntStream;

public class FrecuencyCalibrator {
	
	public Integer calibrate( Integer initial, List<String> strChanges) {
		
		IntStream changes = strChanges.stream().mapToInt(Integer::parseInt);
		
		return this.calibrate(initial, changes);
	}

	public Integer calibrate( Integer initial, IntStream changes) {
		
		Integer finalChange = changes.sum();
		
		return initial + finalChange;
	}

}

	