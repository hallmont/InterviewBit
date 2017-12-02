public class MinCharacterPalindrome {
    public int solve(String A) {
        int count = 0;
        int index = A.length() - 1;
        StringBuilder sb = new StringBuilder( A );
        
        char ch;
        while(true) {
            if ( isPalindrome(sb.toString()) ) return count;
            
            ch = A.charAt(index);
            
            sb.insert(count,ch);
            
            count++;
            index--;
        }
    }
    
    public boolean isPalindrome( String str ) {
        int i = 0;
        int j = str.length()-1;
        while( i < j ) {
            if( str.charAt(i) != str.charAt(j) )
                return false;
            i++;
            j--;
        }
        return true;
    }
}
