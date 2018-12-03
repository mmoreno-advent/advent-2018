package es.m3software.advent2018.day3;

import java.util.List;

public class NotSolapedClaimFinder {

	public String find( List<String> ids ) {

		for (int i = 0; i < ids.size(); i++) {
			
			System.out.println("Verifing: " + ids.get(i));
			
			Claim c1 = new Claim( ids.get(i));
			boolean solaped = false;
			
			for (int j = 0; j < ids.size(); j++) {
				if ( i != j ) {
					Claim c2 = new Claim(ids.get(j));
					if ( c1.isSolaped(c2)) {
						solaped = true;
						break;
					}
				}
			}
			
			if ( !solaped ) {
				return c1.getId();
			} 
		}
			
		return null;
	}

}
