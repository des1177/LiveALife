



// in-order traversal print a binary tree
void inOrder (TreeNode root) {
      //base case
      if(root == null) {
        return;      
      }
      //recursive rule
      inOrder(root.left);
      System.out.println(root.val);
      inOrder(root,right);
}
--------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------
// pre-order traversal print a binary tree
void preOrder (TreeNode root) {
      //base case
      if(root == null) {
        return;      
      }
      //recursive rule
      System.out.println(root.val);
      preOrder(root.left);
      preOrder(root,right);
}

--------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------
// find height of a binary tree -
public int maxDepth(TreeNode root) {
      // base case
      if(root == null) {
        return 0;
      }
      // resursive rule 
      int height = Math.max(maxDepth(root.left),maxDepth(root.right))+1;
      return height;
    }

--------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------
