import Foundation

class Solution {
    func largestNumber(_ A: [Int]) -> String {
        // sorted = sort A
        let sorted = A.sorted( by: {
                let a = String($0)
                let b = String($1)
                return a+b > b+a
            }
        )

        if sorted.count > 0 && sorted[0] == 0 {
            return "0"
        }
        
        // B = concat sorted
        let B = sorted.reduce( "", { String($0) + String($1) } )

        // return B
        return B
    }
}

let solution = Solution()
let A = [ 3, 30, 34, 5, 9 ]
let result = solution.largestNumber( A )

print( result )
