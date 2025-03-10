public class App {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insertAtHead("0000");
        list.insertAtHead("2");
        list.insertAtHead("1211");
        list.insertAtTail("-11");
        list.insertAtTail("-20000");

        list.readFromHead();
        list.insertAtIndex(2, "novo");
        System.out.println();
        list.readFromHead();
        list.removeAtIndex(3);
        System.out.println();

        list.readFromHead();

        System.out.println();
    }
}
