public class LinkedListBasic {

  public static void main(String[] args) {

    ListNode head = null;

    // add 4 elements to LL
    head = addElement(head, 2);
    head = addElement(head, 4);
    head = addElement(head, 11);
    head = addElement(head, 14);

    // traverse LL
    traverse(head);

    // length of linked list
    int length = length(head);
    System.out.println("Length of LL is " + length);

    // remove last item from LL

    // traverse LL

    // remove 2nd item from LL
  }

  private static ListNode addElement(ListNode head, int data) {
    if (head == null) {
      head = new ListNode(data);
      return head;
    }

    ListNode last = head;
    while (last.getNext() != null) {
      last = last.getNext();
    }

    ListNode newListNode = new ListNode(data);
    last.setNext(newListNode);

    return head;
  }


  private static void traverse(ListNode head) {
    if (head == null) {
      System.out.println("LinkedList is empty");
    } else {
      ListNode current = head;
      while (current != null) {
        System.out.println(current.getData());
        current = current.getNext();
      }
    }
  }

  private static int length(ListNode head) {
    if (head == null) {
      return 0;
    } else {
      ListNode current = head;
      int length = 0;
      while (current != null) {
        length++;
        current = current.getNext();
      }

      return length;
    }
  }

  private static class ListNode {

    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
    }

    public void setData(int data) {
      this.data = data;
    }

    public int getData() {
      return this.data;
    }

    public void setNext(ListNode listNode) {
      this.next = listNode;
    }

    public ListNode getNext() {
      return this.next;
    }
  }

}
