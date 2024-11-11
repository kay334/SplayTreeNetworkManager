import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String cmn = "192.168.3.";
        SplayTree t = new SplayTree();

        Node[] nodes = {
            new Node(104), new Node(112), new Node(117),
            new Node(124), new Node(121), new Node(108),
            new Node(109), new Node(111), new Node(122),
            new Node(125), new Node(129)
        };

        for (Node node : nodes) {
            t.insert(node);
        }

        int[] find = {104, 112, 117, 124, 121, 108, 109, 111, 122, 125, 129};
        Random rand = new Random();

        for (int x = 0; x < find.length; x++) {
            int data = rand.nextInt(200);
            Node temp = t.search(t.root, find[x]);
            if (temp != null) {
                temp.dataPacket = data;
            }
        }

        System.out.println("IP ADDRESS -> DATA PACKET");
        t.inorder(t.root, cmn);
    }
}
