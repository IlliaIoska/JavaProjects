public class BinaryTree {
    private Node root;
    private BinaryTree bt;

    private Node addNode(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }

        if (currentNode.getValue() < value) {
            currentNode.rightChild = addNode(currentNode.rightChild, value);
        } else if (currentNode.getValue() > value) {
            currentNode.leftChild = addNode(currentNode.rightChild, value);
        } else {
            return currentNode;
        }
        return currentNode;
    }

    public void addNode(int value) {
        this.root = addNode(this.root, value);
    }
    private boolean hasTreeElement(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }

        if (currentNode.getValue() == value) {
            return true;
        }

        return (currentNode.getValue() < value)
                ? hasTreeElement(currentNode.rightChild, value)
                : hasTreeElement(currentNode.leftChild, value);
//        if (currentNode == null) {
//            return false;
//        }
//        System.out.println("The current node value = " + currentNode.getValue());
//        if (currentNode.getValue() == value) {
//            System.out.println("Found the node");
//            return true;
//        } else if (currentNode.getValue() > value) {
//            System.out.println("Entered currentNode.value > value");
//            hasTreeElement(currentNode.getLeftChild(), value);
//        } else {
//            System.out.println("Entered currentNode.value < value");
//            hasTreeElement(currentNode.getRightChild(), value);
//        }
//        System.out.println("Have not found the node");
//        return false;
    }

    public boolean hasTreeElement(int value) {
        return hasTreeElement(this.root, value);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.addNode(5);
        bt.addNode(3);

        System.out.println(bt.hasTreeElement(3));
    }
}
