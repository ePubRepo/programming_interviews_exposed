package practice_questions;

public class SinglyLinkedListHelper_1579<T> {
  private final SinglyLinkedListNode_1579<T> head;
  private SinglyLinkedListNode_1579<T> slowPointer;
  private SinglyLinkedListNode_1579<T> fastPointer;

  public SinglyLinkedListHelper_1579(SinglyLinkedListNode_1579<T> head) {
    this.head = head;
  }

  public boolean isCyclicList() {
    if (head == null || head.getNextNode() == null) {
      return false;
    }

    slowPointer = head;
    fastPointer = head;
    while(true) {
      // Move both pointers up by one.
      slowPointer = slowPointer.getNextNode();
      fastPointer = fastPointer.getNextNode();
      if (fastPointer == null) {
        return false;
      }
      // Move fast pointer ahead of slow pointer by one.
      fastPointer = fastPointer.getNextNode();
      if (fastPointer == slowPointer) {
        return true;
      }
    }
  }
}