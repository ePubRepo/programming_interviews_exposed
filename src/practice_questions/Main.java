package practice_questions;

public class Main {

	public static void main(String[] args) {
        SinglyLinkedListNode_1342<Integer> node1 = new SinglyLinkedListNode_1342<Integer>(1);
		SinglyLinkedListNode_1342<Integer> node2 = new SinglyLinkedListNode_1342<Integer>(2);
		SinglyLinkedListNode_1342<Integer> node3 = new SinglyLinkedListNode_1342<Integer>(3);
		SinglyLinkedListNode_1342<Integer> node4 = new SinglyLinkedListNode_1342<Integer>(4);
		SinglyLinkedListNode_1342<Integer> node5 = new SinglyLinkedListNode_1342<Integer>(5);
		
		node1.setNextNode(node2);
		node2.setNextNode(node3);
		node3.setNextNode(node4);
		node4.setNextNode(node5);
		
		SinglyLinkedListHelper_1342<Integer> helper = new SinglyLinkedListHelper_1342<Integer>(node1);
		SinglyLinkedListNode_1342<Integer> val = helper.findMthToLastNode(4);
		System.out.println(val.getValue());
	}

}
