package linkedList;

public class IterativeSearch {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addInMiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (temp != null && i < idx - 1) {
            temp = temp.next;
            i++;
        }
        
        if (temp == null) { // If index is out of bounds, add at the end
            addLast(data);
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
            if (temp == tail) {
                tail = newNode;
            }
        }
    }

    public int iterativeSearch(int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        IterativeSearch list = new IterativeSearch();
        list.addFirst(15);
        list.addFirst(14);
        list.addLast(17);
        list.addLast(18);
        list.addInMiddle(16, 2); // Changed index to 2 to properly insert between 15 and 17
        list.printList();
        System.out.println(list.iterativeSearch(17));
    }
}