package solutions;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class LinkedList {
	public int getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.val;
    }
    
    public static void main(String[] args) {
    	
        // Test Case 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        LinkedList list = new LinkedList();
        int middle1 = list.getMiddle(head1);
        System.out.println("Test Case 1: " + middle1);
        
        // Test Case 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);
        int middle2 = list.getMiddle(head2);
        System.out.println("Test Case 2: " + middle2);
        
        // Test Case 3
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(3);
        int middle3 = list.getMiddle(head3);
        System.out.println("Test Case 3: " + middle3);
        
        // Test Case 4
        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);
        int middle4 = list.getMiddle(head4);
        System.out.println("Test Case 4: " + middle4);
        
        // Test Case 5
        ListNode head5 = new ListNode(1);
        int middle5 = list.getMiddle(head5);
        System.out.println("Test Case 5: " + middle5);
    }
}


