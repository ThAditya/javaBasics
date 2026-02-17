
import java.util.Scanner;

class Node {

    public int data;
    public Node next;

    public Node(int data) {

        this.data = data;

        this.next = null;
    }
}

public class GFGProbOne {

    public static int countOccurrence(Node head, int key) {
        int count = 0;
        while (head != null) {
            if (head.data == key) {
                count++;
            }
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter numbers of Nodes: ");
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            System.out.println("enter the data for node: " + (i + 1) + ":");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Enter the key: ");
        int key = sc.nextInt();

        int count = countOccurrence(head, key);

        System.out.println("THe num of Occurrences " + key + " is: " + count);
    }
}
