public class Main {
    static final int TABLE_SIZE = 20;
    static int[] hashTable = new int[TABLE_SIZE];

    public static void main(String[] args) {
        for (int i = 0; i < TABLE_SIZE; i++) {
            hashTable[i] = -1; // Initialize all values to -1
        }

        int[] values = {100000, 200000, 300000, 400000, 500000, 600000, 700000, 800000, 900000, 110000, 120000, 130000, 140000, 150000, 160000};

        for (int value : values) {
            insert(value);
        }

        System.out.println("Hash Table:");
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.print(hashTable[i] + " ");
        }
    }

    public static void insert(int value) {
        int key = hashFunction(value);
        int originalKey = key;

        while (hashTable[key] != -1) {
            key = (key + 1) % TABLE_SIZE; // Linear probing
            if (key == originalKey) {
                System.out.println("Hash table is full. Cannot insert " + value);
                return;
            }
        }

        hashTable[key] = value;
    }

    public static int hashFunction(int value) {
        return (value % 18) + 2;
    }
}