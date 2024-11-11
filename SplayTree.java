public class SplayTree {
    Node root;

    public SplayTree() {
        this.root = null;
    }

    public Node maximum(Node x) {
        while (x.right != null) {
            x = x.right;
        }
        return x;
    }

    public void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != null) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    public void rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;
        if (y.right != null) {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.right) {
            x.parent.right = y;
        } else {
            x.parent.left = y;
        }
        y.right = x;
        x.parent = y;
    }

    public void splay(Node n) {
        while (n.parent != null) {
            if (n.parent == root) {
                if (n == n.parent.left) {
                    rightRotate(n.parent);
                } else {
                    leftRotate(n.parent);
                }
            } else {
                Node p = n.parent;
                Node g = p.parent;
                if (n == p.left && p == g.left) {
                    rightRotate(g);
                    rightRotate(p);
                } else if (n == p.right && p == g.right) {
                    leftRotate(g);
                    leftRotate(p);
                } else if (n == p.right && p == g.left) {
                    leftRotate(p);
                    rightRotate(g);
                } else if (n == p.left && p == g.right) {
                    rightRotate(p);
                    leftRotate(g);
                }
            }
        }
    }

    public void insert(Node n) {
        Node y = null;
        Node temp = root;
        while (temp != null) {
            y = temp;
            if (n.ipAdd < temp.ipAdd) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        n.parent = y;
        if (y == null) {
            root = n;
        } else if (n.ipAdd < y.ipAdd) {
            y.left = n;
        } else {
            y.right = n;
        }
        splay(n);
    }

    public Node search(Node n, int x) {
        if (n == null || x == n.ipAdd) {
            if (n != null) {
                splay(n);
            }
            return n;
        } else if (x < n.ipAdd) {
            return search(n.left, x);
        } else {
            return search(n.right, x);
        }
    }

    public void inorder(Node n, String cmn) {
        if (n != null) {
            inorder(n.left, cmn);
            System.out.println(cmn + n.ipAdd + " -> " + n.dataPacket);
            inorder(n.right, cmn);
        }
    }
}
