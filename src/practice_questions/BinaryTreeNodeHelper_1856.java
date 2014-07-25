package practice_questions;

public class BinaryTreeNodeHelper_1856<T> {
  public int getHeight(BinaryTreeNode_1856<T> root) {
    // BASE CASE: no node, height is 0
    if (root == null) {
      return 0;
    }

    int leftHeight = getHeight(root.getLeftChild());
    int rightHeight = getHeight(root.getRightChild());
    if (leftHeight > rightHeight) {
      return 1 + leftHeight;
    } else {
      return 1 + rightHeight;
    }
  }
}