/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        int count=0;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            while(size-- >0)
            {
                TreeNode cur = q.poll();
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
                
            }
            count++;
            
        }
        return count;
    }
}
