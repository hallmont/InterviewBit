import Foundation

class Solution {
    func maxSubArray(_ A: [Int]) -> Int {
        var currentMax = A[0]
        var overallMax = A[0]
        for i in 1..<A.count {
            currentMax = max( A[i], A[i] + currentMax )
            overallMax = max( currentMax, overallMax )
        }
        return overallMax
    }
}
