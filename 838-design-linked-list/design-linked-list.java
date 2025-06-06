class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1; 

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) { 
            tail = head;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (tail == null) {
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return; 

        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) { 
            temp = temp.next;
        }

        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return; 

        if (index == 0) { 
            head = head.next;
            if (head == null) tail = null; 
            size--;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) { 
            temp = temp.next;
        }

        temp.next = temp.next.next;
        if (index == size - 1) { 
            tail = temp;
        }
        size--;
    }
}