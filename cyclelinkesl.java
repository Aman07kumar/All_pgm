class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Solution.java
public class cyclelinkesl {
    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }

        ListNode hare = head;
        ListNode turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return true;
            }
        }
        return false;
    }

    // Test in the main method
    public static void main(String[] args) {
        // Create a cycle in the linked list for testing
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Create cycle here (fourth node points to second)

        cyclelinkesl solution = new cyclelinkesl();
        boolean result = solution.hasCycle(head);

        if (result) {
            System.out.println("Cycle detected!");
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
