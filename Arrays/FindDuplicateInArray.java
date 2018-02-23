public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    ArrayList<Integer> b = new ArrayList<Integer>( Collections.nCopies(a.size(),0));
        int val = 0;
        for( int i = 0; i<a.size(); i++ ) {
            val = b.get( a.get(i)-1 );
            if( val == 1) return a.get(i);
            else b.set( a.get(i)-1, 1);
        }
        return -1;
	}
}
