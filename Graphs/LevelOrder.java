/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {

    ArrayList<ArrayList<Integer>> nodes = new ArrayList<>();
    if( A == null){
        return nodes;
    }
    
    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    
    queue.add(A);
    
    while(queue.size()!=0){
        
        int size = queue.size();
        ArrayList<Integer> layerList = new ArrayList<Integer>();
        
        while(size!=0){
            TreeNode temp = queue.poll();
            layerList.add(temp.val);
            
            if(temp.left!=null)queue.add(temp.left);
            if(temp.right!=null)queue.add(temp.right);
            
            size--;
        }
        nodes.add(layerList);
    }
    
    return nodes;
    
}
}
