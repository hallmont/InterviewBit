public class LengthLastWord {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        int len = 0;

        String x = A.trim();
 
        for (int i=0; i<x.length(); i++)
        {
            if (x.charAt(i)==' ')
                len = 0;
            else
                len++;
        }
 
        return len;
    }
}
