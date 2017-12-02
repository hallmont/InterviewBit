public class JustifiedText {
    public ArrayList<String> fullJustify(ArrayList<String> alist, int length) {

        int textCount = 0;
        int textOnlyCount = 0;
        int textSpaceCount = 0;
        int start = 0;
        int end = 0;
        boolean leftJustify = false;
        String line = null;
        String[] array = new String[ alist.size() ];
        for (int i = 0; i < alist.size(); i++) {
            array[i] = alist.get(i);
        }
        
        ArrayList<String> list = new ArrayList<String>();
        for( int i=0; i<array.length; i++ ) {
            textCount += array[i].length();
            textOnlyCount += array[i].length();
            line = null;
            if( i == (array.length-1) )
                leftJustify = true;
            else leftJustify = false;

            if( textCount == length  ) {
                end = i;
                line = getString( array, start, end, textOnlyCount, length, leftJustify );
                start = i+1;
                textCount = textOnlyCount = 0;
            } else if( textCount < length ) {
                textCount++; // Add 1 for space
                if( i == (array.length-1) ) {
                    end = i;
                    line = getString( array, start, end, textOnlyCount, length, leftJustify );
                }
            } else { // textCount > length
                textOnlyCount -= array[i].length();
                end = --i;
                leftJustify = false;
                line = getString( array, start, end, textOnlyCount, length, leftJustify );
                start = i + 1;
                textCount = textOnlyCount = 0;
            }
            if( line != null ) {
                list.add(line);
            }
        }
            
        return list;
    }

    String getString(String[] array, int start, int end,
        int textOnlyCount, int length, boolean leftJustify )
    {
        StringBuilder sb = new StringBuilder();
        int wordCount = end-start+1;
        int spaceCount = length - textOnlyCount;
        int padding = 0;

        if( wordCount == 1 ) {
            sb.append( array[start] );
            appendSpaces( sb, spaceCount );
        } else {
            padding = spaceCount / (wordCount-1);
            int remainder = spaceCount % (wordCount-1);

            for( int i=start; i<=end; i++ ) {
                sb.append( array[i] );

                if( leftJustify == true ) {
                    if( i == end ) {
                        padding = length - textOnlyCount - (wordCount-1);
                        appendSpaces( sb, padding);
                    }
                    else appendSpaces( sb, 1 );
                } else {
                    if ( i < end ) {
                        if( remainder-- > 0 )
                            appendSpaces( sb, padding+1);
                        else
                        appendSpaces( sb, padding );
                    }
                }

            }
        }

        String result = sb.toString();

        return result;
    }

    void appendSpaces( StringBuilder sb, int spaceCount ) {
        for( int i=0; i<spaceCount; i++)
            sb.append(" ");
    }
}
