// is this binary tree Symmertric ?
       10
     /   \
    5a     5b
   / \    /   \
  1a  3a  3b  1b
boolean symmertric (Node left, Node right) { // 给你一个root, 可以用helper()把 5a, 5b 输入
  if(left == null && right == null) {return true;} // base case 1 
  else if (left == null || right == null) {return false;} // base case 2 
  else if(left.value != right.value) {return false;} // base case 3
  // recursive rule
  return symmertric(left.left == right.right) && symmertric(left.right == right.left);
         
}

// check if this is a balanced binary tree ?
// definition of balanced binary tree:
// height of left sub-tree and right sub-tree <= 1
boolean balanced(TreeNode root) {
  // base case 
  if (root == null) {
    return true;
  }
  // recursive rule
  int leftHeight = getHeight(root.left);  // getHeight()这个function在下面有，很短
  int rightHeight = getHeight(root.right);
  if (Math.abs(leftHeight-rightHeight) > 1) {
    return false;
  } 
  return balanced(root.left) &&  balanced(root.right);
}
--------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------
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
public int getHeight(TreeNode root) {
      // base case
      if(root == null) {
        return 0;
      }
      // resursive rule 
      int height = Math.(getHeight(root.left),getHeight(root.right))+1;
      return height;
    }

--------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------
