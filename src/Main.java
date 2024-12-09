public class Main {

    public static void main(String[] args) {

        DoublyLinkedList dl = new DoublyLinkedList();

        dl.insertAfter(1);
        dl.insertAfter(2);
        dl.insertAfter(3);
        dl.insertAfter(4);
        dl.insertAfter(5);

        dl.insertBefore(6);
        dl.insertBefore(7);
        dl.insertBefore(8);
        dl.insertBefore(9);
        dl.insertBefore(10);

        dl.traverse();
        dl.reTraverse(); // AWWWWYEAHHHHHH ...

        dl.removeLast();
        dl.removeLast();
        dl.removeLast();
        dl.removeLast();
        dl.removeLast();

        dl.traverse();

    }

}
