public class Node {
    int ipAdd;
    int dataPacket;
    Node left, right, parent;

    public Node(int ipAdd) {
        this.ipAdd = ipAdd;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
