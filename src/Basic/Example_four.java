package Basic;

// Class representing a node in the Binary Search Tree
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// Class representing the Binary Search Tree
class BinarySearchTree {
    Node root;

    // Constructor to initialize the BST
    BinarySearchTree() {
        root = null;
    }

    // Method to insert a new key
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive function to insert a new key in BST
    Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        // Return the unchanged node pointer
        return root;
    }

    // Method to search for a key in BST
    boolean search(int key) {
        return searchRec(root, key);
    }

    // Recursive function to search a key in BST
    boolean searchRec(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null) {
            return false;
        }
        if (root.key == key) {
            return true;
        }

        // Key is greater than root's key
        if (key < root.key)
            return searchRec(root.left, key);

        // Key is smaller than root's key
        return searchRec(root.right, key);
    }

    // This method calls inOrderRec()
    void inOrder() {
        inOrderRec(root);
    }

    // Recursive function for in-order traversal of BST
    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.key + " ");
            inOrderRec(root.right);
        }
    }

    // Main method to test the BST
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("In-order traversal of the Binary Search Tree:");
        bst.inOrder();

        // Search for nodes in the BST
        int key = 40;
        System.out.println("\n\nSearch result for key " + key + ": " + (bst.search(key) ? "Found" : "Not Found"));

        key = 90;
        System.out.println("Search result for key " + key + ": " + (bst.search(key) ? "Found" : "Not Found"));
    }
}

