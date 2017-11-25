public class FizzBuzz {
    public String[] fizzBuzz(int A) {
        
        String[] list = new String[A];
        for( int i=1; i<=A; i++ ) {
            boolean mult3 = (i%3 == 0);
            boolean mult5 = (i%5 == 0);
            
            if( mult3 && mult5 )
                list[i-1] = "FizzBuzz";
            else if ( mult3 )
                list[i-1] = "Fizz";
            else if( mult5 )
                list[i-1] = "Buzz";
            else list[i-1] = ""+i;
        }
        return list;
    }
}
