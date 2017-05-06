package today.cuckoo.jenhau.experiments;

import java.util.HashMap;

public class ReportPrice {
	HashMap<String, Double> reportPrices(String[] ISBNs, HashMap<String, Double> priceMap) {
		HashMap<String, Double> result = new HashMap<String, Double>();
		
		for (int i=0; i<ISBNs.length; i++) {
			if (priceMap.get(ISBNs[i]) != null) {
				result.put(ISBNs[i], priceMap.get(ISBNs[i]));
			}
		}
		
		return result;
	}
	

	HashMap<String, Double> reportPrices(String[] ISBNs, String[] allPrices) {
		HashMap<String, Double> result = new HashMap<String, Double>();
		
		for (int i=0; i<ISBNs.length; i++) {
			String isbn = ISBNs[i];
			for (int j=0; j<allPrices.length; j++) {
				if (j%2 == 0 && isbn == allPrices[j]) {
					result.put(isbn, new Double(allPrices[j+1]));
				}
			}
		}
		
		return result;
	}

}
