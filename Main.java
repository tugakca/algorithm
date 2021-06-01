public class Main {
    public static void main(String[] args) {
        // Example
        Node node = new Node(5);
        node.appendToEnd(5);
        node.appendToEnd(5);
        node.appendToEnd(7);
        node.appendToEnd(7);
        node.appendToEnd(7);
        node.appendToEnd(8);
        node.appendToEnd(11);
        // End of Example

        //node.printNodes();
        //System.out.println("size: " +  node.length(node));
        System.out.println("Total Distance: " + node.sumOfNodes());
        node = node.deleteNode(node,5);
        node = node.deleteNode(node,5);
        node = node.deleteNode(node,5);
        node = node.deleteNode(node,7);
        node = node.deleteNode(node,7);
        node = node.deleteNode(node,7);
        node = node.deleteNode(node,8);
        node = node.deleteNode(node,11);

        if (node != null)
            node.printNodes();
    }
}
