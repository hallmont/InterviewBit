public class IntegerToRoman
{
    String[][] table = {
        { "I", "V", "X"},
        { "X", "L", "C"},
        { "C", "D", "M"},
        { "M", "?", "!"}
    };

    public String intToRoman( int A ) {
        int place = 0;
        StringBuilder sb = new StringBuilder();
        while ( A > 0 ) {
            int digit = A % 10;
            A = A / 10;
            sb.insert( 0, digitToRoman(digit, place) );
            place++;
        }

        return sb.toString();
    }

    String digitToRoman( int digit, int place ) {
        String[] row = table[place];
        String a = row[0];
        String b = row[1];
        String c = row[2];
        switch( digit ) {
            case 1 : return a;
            case 2 : return a+a;
            case 3 : return a+a+a;
            case 4 : return a+b;
            case 5 : return b;
            case 6 : return b+a;
            case 7 : return b+a+a;
            case 8 : return b+a+a+a;
            case 9 : return a+c;
            default: return "";
        }
    }
}
