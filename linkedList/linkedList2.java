package linkedList;

public class linkedList2 {
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addInMiddle(int data, int index){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;

        int i=0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int deleteFirst(){
        if(size == 0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int deleteLast(){
        if(size == 0){
            System.out.println("List is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev= prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void printList(){
        
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedList2 list = new linkedList2();
        list.addFirst(13);
        list.addFirst(12);
        list.addFirst(11);
        
        list.addLast(14);
        list.addLast(15);
        list.addLast(16);
        
        list.addInMiddle(17, 6);
        list.printList();

        list.deleteFirst();
        list.printList();
        
        list.deleteLast();
        list.printList();

        System.out.println(list.size);
    }
}
