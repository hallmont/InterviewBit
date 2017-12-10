public class SubstringConcat {
    HashMap map = new HashMap();
    ArrayList<Integer> intList = new ArrayList<Integer>();
    
	public ArrayList<Integer> findSubstring(String a, final List<String> b) {
	    ArrayList<Integer> emptyList = new ArrayList<Integer>();
	    List<String> newList = new ArrayList<String>( b.size() );
	    for( int i=0; i<b.size(); i++)
	        newList.add(i,b.get(i) );
	    
	    if ( b.size() < 1 )
	        return emptyList;
	    int wordLength = b.get(0).length();
	    int maxCombinedLength = wordLength * b.size();
	    
	    if( maxCombinedLength > a.length() )
	        return emptyList;

        for( int i=0; i<a.length()-maxCombinedLength+1; i++ ) {
            String substr = a.substring(i,i+maxCombinedLength);
            Integer val = (Integer)map.get(substr);
            if( val == null ) {
                //System.out.println( substr );
                map.put( substr, new Integer(i) );
            }
         }

	     permutations( newList, 0, b.size() - 1);
	     
	     return( intList );
	}
	
	public void permutations( List<String> list, int left, int right) {
        if( left == right ) {
            String str = getString( list );
            Integer val = (Integer)map.get( str );
            //System.out.print( str + ":" + val );
            if( val != null ) {
                intList.add(val);
            }
        } else {
            for( int i=left; i<=right; i++) {
                list = swap( list, left, i );
                permutations( list, left+1, right);
                list = swap( list, left, i);
            }
        }
    }

    public  List<String> swap( List<String> list, int i, int j ) {
        String temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
        return list;
    }
    
    String getString( List<String> list ) {
        StringBuilder sb = new StringBuilder();
        for( int i=0; i<list.size(); i++)
            sb.append(list.get(i));

        return( sb.toString() );
    }
}
