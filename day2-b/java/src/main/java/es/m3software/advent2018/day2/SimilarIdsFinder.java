package es.m3software.advent2018.day2;

import java.util.List;

public class SimilarIdsFinder {

	public String remainCharsSimilarIds( List<String> ids ) {

		for (int i = 0; i < ids.size(); i++) {
			
			for (int j = i + 1; j < ids.size(); j++) {
				
				if( areSimilarsIds( ids.get(i), ids.get(j))) {
					
					System.out.println( ids.get(i) + " - " + ids.get(j) );
					return getRemainChars( ids.get(i), ids.get(j));
				}
			}
		}
		
		return "";
	}
	
	private static Boolean areSimilarsIds( String id1, String id2 ) {
		int diffs = 0;
		for (int i = 0; i < id1.length(); i++) {
			if ( id1.charAt(i) != id2.charAt(i) ) {
				diffs++;
				if ( diffs > 1 ) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	private static String getRemainChars( String id1, String id2 ) {
		StringBuffer remain = new StringBuffer();
		for (int i = 0; i < id1.length(); i++) {
			if ( id1.charAt(i) == id2.charAt(i) ) {
				remain.append(id1.charAt(i));
			}
		}
		return remain.toString();
	}

}
