package practice_questions;

public class SinglyLinkedListHelper_1342<T> {
	  private final SinglyLinkedListNode_1342<T> head;
	  
	  public SinglyLinkedListHelper_1342(SinglyLinkedListNode_1342<T> head) {
	    this.head = head;
	  }

	  public SinglyLinkedListNode_1342<T> findMthToLastNode(int n) {
	    if (head == null) {
	      return null;
	    }
	  
	    int nodesVisited = 0;
	    SinglyLinkedListNode_1342<T> nextNode = head;
	    SinglyLinkedListNode_1342<T> nTrailingNode = null;
	    while (nextNode != null) {
	      if (nodesVisited == n && nTrailingNode == null) {
	        nTrailingNode = head;
	      }
	      nextNode = nextNode.getNextNode();
	      if (nextNode == null) {
	        // At end of list.
	        return nTrailingNode;
	      }

	      if (nTrailingNode != null) {
	        // We are n elements in, so increment the trailing node.
	        nTrailingNode = nTrailingNode.getNextNode();
	      } else {
	        // We are not yet n elements in, so keep counting.
	        nodesVisited++;
	      }
	    }
	    return null;
	  }
	}