public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
//        linkedList.printList();

        linkedList.add(3, 9);
        linkedList.add(3, 9);
        linkedList.printList();
    }
}
