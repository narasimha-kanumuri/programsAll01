import java.io.*;
import java.util.*;

public class Sample {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }
        else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    public  int compare(Node head1, Node head2) {
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) {
                return 0;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return 1;
    }
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        int tests = sc.nextInt();
        for (int i = 0; i < tests; i++) {

            Node head1 = null;
            Node head2 = null;
            int list1Size = sc.nextInt();
            for (int j = 0; j < list1Size; j++) {
                head1 = s.insertAtEnd(head1,sc.nextInt());
            }

            int list2Size = sc.nextInt();
            for (int j = 0; j < list2Size; j++) {
                head2 = s.insertAtEnd(head2, sc.nextInt());
            }
            
            int ans;

            if (list1Size == list2Size) {
                ans = s.compare(head1, head2);
            }
            else {
                ans = 0;
            }
            System.out.println(ans);
        }
    }
}