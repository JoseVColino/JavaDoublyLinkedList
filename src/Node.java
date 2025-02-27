public class Node<T> {
    Node<T> next;
    Node<T> prev;
    T data;

    Node(T data) {
        next = null;
        prev =null;
        this.data = data;
    }
}
