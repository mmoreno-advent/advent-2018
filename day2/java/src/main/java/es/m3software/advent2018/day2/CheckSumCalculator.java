package es.m3software.advent2018.day2;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckSumCalculator {

	public Integer calculate( List<String> ids) {

		int chars2 = 0;
		int chars3 = 0;
		
		for (String id : ids) {
			
			Map<Integer, Long> map = CheckSumCalculator.getCharsMap(id);
			
			Collection<Long> values = map.values();
			if ( values.contains( Long.valueOf(2))) {
				chars2++;
			}
			if ( values.contains(Long.valueOf(3))) {
				chars3++;
			}
			System.out.println(id + " " + chars2 + " " + chars3 );
			
		}
		return chars2 * chars3;
	}

	private static Map<Integer, Long> getCharsMap( String id ) {
		
		IntStream codes = id.chars();
		Map<Integer, Long> map = codes.boxed().collect( Collectors.groupingBy( Integer::intValue
												          , Collectors.counting() ) );
		
		return map;
	}
}
