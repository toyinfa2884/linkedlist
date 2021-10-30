package dataStructures;

public class Singly_LinkedList {
    Node<String> head;

    public Singly_LinkedList(Node<String> head){
        this.head = head;
    }

    public void addToEnd(Node<String> newNode){
        Node<String> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void addToHead(Node<String> newNode){
        Node<String> current = head;
        head = newNode;
        head.next = current;
    }

    public  void addToMiddle(Node<String> newNode, int position){
        int counter = 1;
        Node<String> current = head;

        while (counter!=position-1){
            current = current.next;
            counter++;
        }
        Node<String> temp = current.next;
        current.next = newNode;
        newNode.next = temp;
    }
    public void removeFromEnd(){
        Node<String> current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }
    public void removeFromPosition(int position){
        int counter = 1;
        Node<String> current = head;

        while (counter!=position-1){
            current = current.next;
            counter++;
        }
        current.next = current.next.next;

    }


    public void printList(){
        Node<String> current = head;
        while(current != null){
            System.out.print(current.data);
            System.out.print("-->");
            current = current.next;
        }
        System.out.println("null");
    }
}
class MainTest{
    public static void main(String[] args) {
        Node<String> nodeOne = new Node<>("John");
        Singly_LinkedList list = new Singly_LinkedList(nodeOne);
        list.addToEnd(new Node<>("Mojo"));
        list.addToEnd(new Node<>("Gideon"));
        list.printList();
        list.addToEnd(new Node<>("Dami"));
        list.printList();
        list.addToHead(new Node<>("Israel"));
        list.printList();
        list.addToMiddle(new Node<>("Teslim"), 2);
        list.printList();
        list.removeFromEnd();
        list.printList();
        list.removeFromPosition(2);
        list.printList();
    }
}
