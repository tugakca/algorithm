public class Node {

    Node following = null;

    int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToEnd(int data) {
        Node end = new Node(data);
        Node n = this;

        while (n.following != null) {
            n = n.following;
        }
        n.following = end;
    }

    public void printNodes() {
        Node header = this;
        while (header != null)
        {
            System.out.print("--> " + header.data + " ");

            header = header.following;
        }
    }

    int length(Node h) {
        int length = 0;

        while (h != null)
        {
            length++;
            h = h.following;
        }
        return length;
    }

    int sumOfNodes() {
        Node header = this;
        int sum = 0;
        while (header != null)
        {
            sum += header.data;
            header = header.following;
        }
        return sum*2;
    }

    Node deleteNode(Node head, int data) {
        Node n = head;
        if (n.data == data) {
            return head.following;
        }

        Node prev = null;
        while (n != null && n.data != data) {
            prev = n;
            n = n.following;
        }

        if (n == null)
            return head;

        prev.following = n.following;

        return head;
    }
}