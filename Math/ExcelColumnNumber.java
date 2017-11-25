public class ExcelColumnNumber {
    public int titleToNumber(String A) {
        int num = 0;
        int mult = 1;

        for( int i=0; i<A.length(); i++) {
            byte asciiVal = (byte)A.charAt(A.length()-i-1);
            int basenum = asciiVal - 64;
            num += mult*basenum;
            mult *= 26;
        }
        return num;
    }
}
