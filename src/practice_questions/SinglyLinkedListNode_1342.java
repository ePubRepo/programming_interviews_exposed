package practice_questions;

public class SinglyLinkedListNode_1342<T> {
  private final T value;
  private SinglyLinkedListNode_1342<T> nextNode;

  public SinglyLinkedListNode_1342(T value) {
    this.value = value;
  }

  public SinglyLinkedListNode_1342<T> getNextNode() {
    return nextNode;
  }

  public void setNextNode(SinglyLinkedListNode_1342<T> nextNode) {
    this.nextNode = nextNode;
  }

  public T getValue() {
    return this.value;
  }
}