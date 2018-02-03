import Foundation

class Solution
{
    func minDistance(_ A: inout String, _ B: inout String) -> Int {
        var dp: [[Int]] = Array(repeating: Array(repeating: 0, count: B.count+1), count: A.count+1 )
        let ArrayA = Array(A)
        let ArrayB = Array(B)
        
        for col in 0...B.count {
            dp[0][col] = col
        }
        
        for row in 1...A.count {
            dp[row][0] = row
            for col in 1...B.count {
                let left = dp[row][col-1]
                let top  = dp[row-1][col]
                let diag = dp[row-1][col-1]
                
                let aChar = ArrayA[row-1]
                let bChar = ArrayB[col-1]
                let delta = (aChar == bChar) ? 0 : 1
                dp[row][col] = min( left+1, top+1, diag+delta )
            }
        }
        for row in 0...A.count {
            print( dp[row])
        }

        return dp[A.count][B.count]
    }
}

var A = "Anshuman"
var B = "Antihuman"
var solution = Solution()
let result = solution.minDistance( &A, &B )
