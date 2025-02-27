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
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
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
