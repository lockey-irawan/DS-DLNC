public class Node {

    public int value;
    public Node prev;
    public Node next;

    // constr

    public Node() {
        prev = next = null;
    }

    public Node(int v) {
        value = v;
        prev = next = null;
    }

    public String toString() {
        return value + "";
    }

}
