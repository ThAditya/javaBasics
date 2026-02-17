package linkedList;
class Node{
    char data;
    Node add;
    Node(char data){
        this.data = data;
        this.add = null;
    }
}
public class linkedList1 {

    public static void traverse(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data + "->");
            temp = temp.add;
        }
    }

    // public static void 


    public static void addNewLeft(Node head){
        Node temp = new Node('D');
    }

    public static void newNode(Node head, char data){
        Node ptr = head;

        while(ptr.add != null){
            ptr = ptr.add;
        }
        Node newNode = new Node(data);
        ptr.add = head;
    }

    public static void main(String[] args) {
        
        Node head = new Node('A');
        newNode(head,'B');
        newNode(head,'c');
        newNode(head,'d');
        traverse(head);
    }
}
