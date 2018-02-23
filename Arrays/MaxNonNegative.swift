import Foundation

class Solution {
    func maxset(_ A: inout [Int]) -> [Int] {
        var sum = 0, length = 0
        var maxSum = -1, maxLength = -1, minIndex = -1, startIndex = 0
        for i in 0..<A.count {
            if( A[i] < 0 ) {
                continue
            }
            // Start of subarray
            if i == 0 || A[i-1] < 0 {
                startIndex = i
                sum = 0
                length = 0
            }
            sum += A[i]
            length += 1
            // End of subarray
            if i == A.count-1 || A[i+1] < 0 {
                if sum > maxSum || (sum == maxSum && length > maxLength) {
                    minIndex = startIndex
                    maxSum = sum
                    maxLength = length
                }
            }
        }
        if minIndex < 0 {
            return []
        }
        var result :[Int] = []
        for i in minIndex..<(minIndex+maxLength) {
            result.append(A[i])
        }
        return result
    }
}

let solution = Solution()
var A :[Int]
A = [ 1, 2, 5, -7, 2, 3 ]
A = [1,2,3,-7,-7,-7,2,3,-7,-7]
A = [-1,2,3,4,5,-2]
A = [-1,-1,-1,-1]
A = [0, 0, -1, 0]
A = [ 756898537, -1973594324, -2038664370, -184803526, 1424268980 ]

let result = solution.maxset( &A )
