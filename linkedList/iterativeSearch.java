package linkedList;

public class iterativeSearch {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addInMiddle(int data, int idx){
        if(head == null){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        int i=0;

        while (i < idx-1) {
            head = head.next;
            i++;
        }
        newNode.next = head.next;
        head.next = newNode;
    }

    public static int itertive(int key) {
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

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        iterativeSearch list = new iterativeSearch();
        list.addFirst(15);
        list.addFirst(14);
        list.addLast(17);
        list.addLast(18);
        list.addInMiddle(16, 3);

        list.printList();
    }
}
