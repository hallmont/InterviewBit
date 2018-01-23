public class Solution {

public ArrayList<Integer> grayCode(int a) {
    if(a==0){
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        return result;
    }
 
    ArrayList<Integer> result = grayCode(a-1);
    int numToAdd = 1<<(a-1);
 
    for(int i=result.size()-1; i>=0; i--){
        result.add(numToAdd+result.get(i));
    }
 
    return result;
}

}
