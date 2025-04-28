public class BSTTest {
    public static void main(String[] args) {
        BST<Integer, String> tree = new BST<>();

        tree.put(5, "five");
        tree.put(3, "three");
        tree.put(7, "seven");

        // In-order traversal using the iterator
        for (Integer key : tree) {
            System.out.println("key is " + key + " and value is " + tree.get(key));
        }

        // Print size of the tree
        System.out.println("Size of tree: " + tree.size());
    }
}
