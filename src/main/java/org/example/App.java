package org.example;
public class App {
    public static void main(String[] args) {
        Node root = new Node("R");
        Node a = new Node(root,"A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");
        Node i = new Node("I");
        root.addChild(d);
        a.addChild(b);
        a.addChild(c);
        d.addChild(e);
        d.addChild(f);
        d.addChild(g);
        e.addChild(h);
        e.addChild(i);
        e.addChild(new Node("J"));

        System.out.println("root: " + root);
        System.out.println("child of root: " + root.getChildrenList());
        System.out.println("Node A: " + a);
        System.out.println("child of A: " + a.getChildrenList());
        System.out.println("Parent B: "+b.getParent());
        System.out.println("Node D: " + d);
        System.out.println("child of D: " + d.getChildrenList());
        System.out.println("Node E: " + e);
        System.out.println("child of E: " + e.getChildrenList());
        root.print(root);
    }
}
