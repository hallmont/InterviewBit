import Foundation

class Solution {
    func repeatedNumber(_ A: [Int]) -> [Int] {
        var aVal = 0, bVal = 0
        var B: [Int] =  Array( repeating: 0, count: A.count)
        for i in 0..<A.count {
            let val = B[ A[i]-1 ]
            if val == 1 {
                aVal = A[i]
            } else {
                B[ A[i]-1 ] = 1
            }
        }
        
        for i in 0..<A.count {
            if B[i] == 0 {
                bVal = i+1
            }
        }
        
        let result = [ aVal, bVal ]
        return result
    }
}
