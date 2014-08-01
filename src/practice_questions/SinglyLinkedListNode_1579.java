package practice_questions;

public class SinglyLinkedListNode_1579<T> {
  private final T data;
  private SinglyLinkedListNode_1579<T> nextNode;

  public SinglyLinkedListNode_1579(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setNextNode(SinglyLinkedListNode_1579<T> nextNode) {
    this.nextNode = nextNode;
  }

  public SinglyLinkedListNode_1579<T> getNextNode() {
    return nextNode;
  }
}