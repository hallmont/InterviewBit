import Foundation

class Solution {

    func climbStairs(_ A: inout Int) -> Int {
        return climbStairsR( 0, A )
    }
    
    func climbStairsR( _ i: Int, _ A: Int ) ->Int {
        if i > A {
            return 0
        }
        
        if i == A {
            return 1;
        }
        
        return climbStairsR( i+1, A ) + climbStairsR( i+2, A )
    }
}
