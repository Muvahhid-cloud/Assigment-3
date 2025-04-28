import java.util.Random;

public class HashTableTest {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();

        Random random = new Random(); // Random generator for keys
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(random.nextInt(100000), "Name" + i); // Create random key
            table.put(key, "Value" + i); // Insert random key-value pair into the table
        }

        // Print number of elements in each bucket
        table.printBucketSizes();
    }
}
