
// find height of a binary tree
public int maxDepth(TreeNode root) {
      // base case
      if(root == null) {
        return 0;
      }
      // resursive rule 
      int height = Math.max(maxDepth(root.left),maxDepth(root.right))+1;
      return height;
    }
