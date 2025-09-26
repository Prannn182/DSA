class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Get value at index
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // Add at head
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) tail = node; // first node
        size++;
    }

    // Add at tail
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(tail == null) {
            head = tail = node; // first node
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // Add at index
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        if(index == 0) {
            addAtHead(val);
            return;
        }
        if(index == size) {
            addAtTail(val);
            return;
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    // Delete at index
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;

        if(index == 0) { // delete head
            head = head.next;
            size--;
            if(head == null) tail = null;
            return;
        }

        Node prev = head;
        for(int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        if(index == size - 1) { // delete tail
            tail = prev;
            prev.next = null;
        } else { // delete middle
            prev.next = prev.next.next;
        }

        size--;
    }
}
