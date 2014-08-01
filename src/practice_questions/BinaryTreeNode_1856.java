package practice_questions;

public class BinaryTreeNode_1856<T> {
  private final T value;
  private BinaryTreeNode_1856<T> leftChild;
  private BinaryTreeNode_1856<T> rightChild;

  public BinaryTreeNode_1856(T value) {
    this.value = value;
  }

  public void setLeftChild(BinaryTreeNode_1856<T> leftChild) {
    this.leftChild = leftChild;
  }

  public BinaryTreeNode_1856<T> getLeftChild() {
    return leftChild;
  }

  public void setRightChild(BinaryTreeNode_1856<T> rightChild) {
    this.rightChild = rightChild;
  }

  public BinaryTreeNode_1856<T> getRightChild() {
    return rightChild;
  }

  public T getValue() {
    return value;
  }
}