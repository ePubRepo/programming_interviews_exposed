package practice_questions;

public class Main {
  public static void main(String[] args) {
    /**
     *                          Node 1 (10)
     *             Node 2 (8)                    Node 3 (15)
     *     Node 4 (6)
     * Node 5 (4)
     */
    
    BinaryTreeNode_1856<Integer> node1 = new BinaryTreeNode_1856<Integer>(10);
    BinaryTreeNode_1856<Integer> node2 = new BinaryTreeNode_1856<Integer>(8);
    BinaryTreeNode_1856<Integer> node3 = new BinaryTreeNode_1856<Integer>(15);
    BinaryTreeNode_1856<Integer> node4 = new BinaryTreeNode_1856<Integer>(6);
    BinaryTreeNode_1856<Integer> node5 = new BinaryTreeNode_1856<Integer>(4);

    node1.setLeftChild(node2);
    node1.setRightChild(node3);

    node2.setLeftChild(node4);
    node4.setLeftChild(node5);

    BinaryTreeNodeHelper_1957<Integer> helper = new BinaryTreeNodeHelper_1957<Integer>(node1);
    System.out.println(helper.findLCA(node2, node3).getValue());
  }

/*
  public static void main(String[] args) {
    BinaryTreeNode_1856<Integer> node1 = new BinaryTreeNode_1856<Integer>(1);
    BinaryTreeNode_1856<Integer> node2 = new BinaryTreeNode_1856<Integer>(2);
    BinaryTreeNode_1856<Integer> node3 = new BinaryTreeNode_1856<Integer>(3);
    BinaryTreeNode_1856<Integer> node4 = new BinaryTreeNode_1856<Integer>(4);
    BinaryTreeNode_1856<Integer> node5 = new BinaryTreeNode_1856<Integer>(5);

    node1.setLeftChild(node2);
    node1.setRightChild(node3);

    node2.setLeftChild(node4);
    node4.setLeftChild(node5);

    BinaryTreeNodeHelper_1856<Integer> helper = new BinaryTreeNodeHelper_1856<Integer>();
    System.out.println(helper.getHeight(node1));
  }
*/

/*
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
*/
}
