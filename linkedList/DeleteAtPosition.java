package linkedList;
import java.util.Scanner;

// Node class for linked list
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteAtPosition {
    
    // Function to delete node at given position (1-based)
    public static Node deleteAtPosition(Node head, int pos) {
        if (head == null) return null;
        
        // If we need to delete the head node (position 1)
        if (pos == 1) {
            return head.next;
        }
        
        Node current = head;
        Node prev = null;
        int count = 1;
        
        // Traverse to the node at position 'pos'
        while (current != null && count < pos) {
            prev = current;
            current = current.next;
            count++;
        }
        
        // If position is valid, delete the node
        if (current != null) {
            prev.next = current.next;
        }
        
        return head;
    }
    
    // Function to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ");
            }
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of nodes
        int n = scanner.nextInt();
        
        // Read node values
        Node head = null;
        Node tail = null;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        
        // Read position to delete
        int pos = scanner.nextInt();
        
        // Delete node at position
        head = deleteAtPosition(head, pos);
        
        // Print the resulting list
        printList(head);
        
        scanner.close();
    }
}