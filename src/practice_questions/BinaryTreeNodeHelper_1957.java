package practice_questions;

public class BinaryTreeNodeHelper_1957<T extends Comparable<T>> {
  private final BinaryTreeNode_1856<T> root;
  public BinaryTreeNodeHelper_1957(BinaryTreeNode_1856<T> root) {
    this.root = root;
  }

  public BinaryTreeNode_1856<T> findLCA(BinaryTreeNode_1856<T> one,
      BinaryTreeNode_1856<T> two) {
    return walkTreeToFindLCA(root, one, two);
  }

  private BinaryTreeNode_1856<T> walkTreeToFindLCA(
      BinaryTreeNode_1856<T> current,
      BinaryTreeNode_1856<T> one,
      BinaryTreeNode_1856<T> two) {
    // TODO: Should check null, etc.
    if (current.getValue().compareTo(one.getValue()) < 0 &&
        current.getValue().compareTo(two.getValue()) < 0) {
      return walkTreeToFindLCA(current.getRightChild(), one, two);
    }

    if (current.getValue().compareTo(one.getValue()) > 0 &&
        current.getValue().compareTo(two.getValue()) > 0) {
      return walkTreeToFindLCA(current.getLeftChild(), one, two);
    }

   return current;
  }
}
