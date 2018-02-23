import Foundation

class Solution {
    func plusOne(_ A: inout [Int]) -> [Int] {
        var quotient = 0
        var result: [Int] = []
        var remainder: Int = 0
        var startIndex = 0
        for i in 0..<A.count {
            if( A[i] > 0 ) {
                startIndex = i
                break
            }
        }
        for i in 0..<(A.count-startIndex) {
            var val = A[A.count-i-1]
            val += quotient
            if( i == 0 ) {
                val += 1
            }
            quotient = val / 10
            remainder = val % 10
            
            result.insert(remainder, at: 0)
        }
        if( quotient > 0 ) {
            result.insert(quotient, at: 0)
        }
        
        return result
    }
}
