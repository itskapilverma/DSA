/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void solve(TreeNode root,int target,List<Integer> temp,List<List<Integer>> a){
        if(root==null)return;
        temp.add(root.val);
        if(root.val==target&&root.left==null&&root.right==null)a.add(new ArrayList<Integer>(temp));
        else{
            solve(root.left,target-root.val,temp,a);
            solve(root.right,target-root.val,temp,a);
        }temp.remove(temp.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(root,targetSum,temp,l);
        return l;
    }
}