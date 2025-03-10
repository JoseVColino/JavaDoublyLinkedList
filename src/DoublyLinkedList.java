public class DoublyLinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void insertAtHead(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            tail = newNode;
            head = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void readFromHead() {
        if (head == null) {
            System.out.println("A lista está vazia");
            return;
        }
        int cout = 0;
        Node<T> current = head;
        while (current != null) {
            System.out.println("[" + cout + "] = " +current.data);
            current = current.next;
            cout++;
        }
    }

    public void readFromTail() {
        if (tail == null) {
            System.out.println("A lista está vazia");
            return;
        }
        Node<T> current = tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("A lista está vazia");
            return;
        }
        if (head == tail){
            head = null;
            tail = null;
            return;
        }
        Node<T> temp = head;
        head = head.next;
        temp.next = null;
        head.prev = null;
    }

    public void insertAtIndex(int i, T data){
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        int cout = 0;
        Node<T> temp = head;
        while (cout != i){
            temp = temp.next;
            cout++;
        }
        newNode.next = temp;
        newNode.prev = temp.prev;
        temp.prev.next = newNode;
        temp.prev = newNode;
    }

    public void removeAtIndex(int i){
        if (head == null) {
            System.out.println("A lista está vazia");
            return;
        }

        int cout = 0;
        Node<T> temp = head;
        while (cout != i){
            temp = temp.next;
            cout++;
        }
        removeCurrent(temp);
    }

    public boolean removeAtValue(String data) {
        if (head == null) {
            System.out.println("a lista está vazia");
            return false;
        }
        Node<T> temp = head;
        while (temp!=null && temp.data != data) {
            temp = temp.next;
        }

        if (temp!= null) {
            removeCurrent(temp);
            return true;
        }
        return false;
    }

    private void removeCurrent(Node<T> current) {
        if (current == head){
            head.next.prev = null;
            head = head.next;
            return;
        }
        if (current == tail) {
            tail.prev.next = null;
            tail = tail.prev;
            return;
        }

        current.next.prev = current.prev;
        current.prev.next = current.next;
        current.next = null;
        current.prev = null;
    }

    public void removeLongs(int length) {
            if (head == null) {
                System.out.println("A lista está vazia");
                return;
            }
            Node<T> temp = head;
            while (temp != null) {
                if (temp.data.toString().length() <= length) {
                    removeCurrent(temp);
                }
                temp = temp.next;
            }
    }
}
