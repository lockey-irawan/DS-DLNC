public class DoublyLinkedList {

    public Node head;

    public DoublyLinkedList() {
        head = null; // it means empty list
    }

    // func

    public boolean isEmpty() {
        return head == null ? true : false;
    }

    // put the new node in the last position at the list
    public void insertAfter(int v) {

        Node newNode = new Node(v);

        if (isEmpty()) {
            head = newNode;
        } else {

            Node helper = head;

            while (helper.next != null) {
                helper = helper.next;
            }

            helper.next = newNode;
            newNode.prev = helper;
        }

        System.out.println("inserted !!");
    }

    public void insertBefore(int v) {

        Node newNode = new Node(v);

        if (isEmpty()) {
            head = newNode;
        } else {

            head.prev = newNode;
            newNode.next = head;
            head = newNode;

        }
        System.out.println("inserted !");

    }

    public void traverse() { // re-traverse for desc

        if (!isEmpty()) {
            Node helper = head;

            while (helper != null) {
                System.out.print(helper + " -> ");
                helper = helper.next;
            }

            System.out.println("null");
        } else {
            System.out.println("Empty List !");
        }
    }

    public void reTraverse() {

        if (!isEmpty()) {

            Node helper = head;

            while (helper.next != null) {
                helper = helper.next;
            }

            while (helper != null) {
                System.out.print(helper + " -> ");
                helper = helper.prev;
            }

            System.out.println("null");

        } else {
            System.out.println("Empty List !");
        }

    }

    public void removeFirst() {

        if (isEmpty()) {
            System.out.println("Empty List !");
        } else {

            if (head.next == null) {
                head = null;
            } else {
                head = head.next; // this contain error, wait !
                head.prev = null;
            }
        }

        System.out.println("removed !");
    }

    public void removeLast() {

        if (isEmpty()) {
            System.out.println("Empty List !");
        } else {

            if (head.next == null) {
                head = null;
            } else {

                Node helper = head;

                while (helper.next.next != null) { // must stop at the last 2 node
                    helper = helper.next; // but this code only works for at least there are
                    // at least 2 node or more
                }
                helper.next = null;
            }
            System.out.println("removed !"); // lets try this !!
        }

    }

}
