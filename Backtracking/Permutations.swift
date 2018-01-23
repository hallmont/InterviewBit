import Foundation

class Solution {
    var result: [[Int]] = []

    func swap( _ A: inout [Int], _ i: Int, _ j: Int ) {
        let temp = A[i]
        A[i] = A[j]
        A[j] = temp
    }

    func permuteR( _ A: inout [Int], _ start: Int, _ end: Int ) {
        if( start == end ) {
            // print( A )
            result.append( A )
        }
        else {
            for i in start...end {
                swap( &A, start, i )
                permuteR( &A, start+1, end )
                swap( &A, start, i )
            }
        }
    }

    func permute(_ A: inout [Int]) -> [[Int]] {
        let n = A.count
        permuteR( &A, 0, n-1 )
        return result;
    }
}
