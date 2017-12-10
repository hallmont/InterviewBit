import java.math.*;

public class MaxPoints {
	public int maxPoints(ArrayList<Integer> x, ArrayList<Integer> y) {
	    HashMap map = new HashMap();
	    int maxPoints = 0;
	    if( x.size() == 1 || y.size() == 1 ) maxPoints = 1;
	    for( int i=0; i<x.size(); i++) {
	        for( int j=i+1; j<y.size(); j++) {

	            // Find slope of line
	            int y1 = y.get(j) - y.get(i);
	            int x1 = x.get(j) - x.get(i);
	            
	            // Get gcd of fraction
	            int gcd = getGCD(y1,x1);
	            if( gcd == 0 ) {
	                gcd = 1;
	                //if( i > 0) continue;
	            }
	            int y2 = y1 / gcd;
	            int x2 = x1 / gcd;
	            
	            // If fraction exists in hashmap, increment count
	            // Update maxPoints
	            String key = y2 + ":" + x2;
	            Integer value = (Integer)map.get(key);
	            if( value != null ) {
	                map.put(key, ++value);
	                maxPoints = Math.max(maxPoints,value);
	            }
	            // Else add fraction to hashmap and give initial count of 2
	            else {
	                map.put(key, 2);
	            }
	        }
	    }
	    return maxPoints;
	}
	
	public int getGCD(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
	}
}
