public class SubstringConcat {
    HashMap map = new HashMap();
    ArrayList<Integer> intList = new ArrayList<Integer>();
    
	public ArrayList<Integer> findSubstring(String a, final List<String> b) {
        ArrayList<Integer> emptyList = new ArrayList<Integer>();

        if ( b.size() < 1 )
            return emptyList;
        Collections.sort(b);

        int totalSum = getHashSum( b );

        int wordLength = b.get(0).length();
        int maxCombinedLength = wordLength * b.size();

        if( maxCombinedLength > a.length() )
            return emptyList;
            
        for( int i=0; i<a.length()-maxCombinedLength+1; i++ ) {
            int sum = 0;
            for( int j=i; j<i+maxCombinedLength; j += wordLength ) {
               String word = a.substring(j,j+wordLength);
               sum += word.hashCode();
            }
            
            ArrayList<String> list = null;
            if( sum == totalSum ) {
                list = new ArrayList<String>();
                for( int j=i; j<i+maxCombinedLength; j += wordLength ) {
                    String word = a.substring(j,j+wordLength);
                    list.add( word );
                }
                Collections.sort( list );
                if( isEqual(b,list) )
                    intList.add(i);
            }
        }
        
        return( intList );
	}
	
	boolean isEqual( List<String> a, List<String> b ) {
        for( int i=0; i<a.size(); i++) {
            if( !a.get(i).equals( b.get(i) ))
                return false;
        }
        return true;
    }
	
	public static int getHashSum( List<String> list ) {
        int sum = 0;
        for( int i=0; i<list.size(); i++ )
            sum += list.get(i).hashCode();

        return sum;
    }

}
