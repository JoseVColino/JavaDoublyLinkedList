public class App {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insertAtHead("0000");
        list.insertAtHead("112");
        list.insertAtHead("1211");
        list.insertAtTail("-11");
        list.insertAtTail("-20000");

        list.removeLongs(4);
        list.readFromTail();
        System.out.println();
    }
}
