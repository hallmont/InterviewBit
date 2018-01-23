import Foundation

class Solution {
    func subsetsR(_ A: inout [Int], _ chosen: inout [Int], _ result: inout [[Int]]) {
        if A.isEmpty == true {
            result.insert( chosen, at: 0)
        } else {
            let first = A[A.count-1]
            A.removeLast()
            
            chosen.insert(first, at: 0)
            subsetsR( &A, &chosen, &result)
            
            chosen.removeFirst()
            subsetsR( &A, &chosen, &result)
            
            A.append(first)
        }
    }
    
    func subsets(_ A: inout [Int]) -> [[Int]] {
        A.sort{ $0 < $1 }
        var chosen: [Int] = []
        var result: [[Int]] = []
        subsetsR( &A, &chosen, &result )
        result.sort { (a, b) -> Bool in
             if a.isEmpty {
                return false
             } else if b.isEmpty {
                return false
             } else {
                return a[0] < b[0]
             }
         }
        return result
    }
}
