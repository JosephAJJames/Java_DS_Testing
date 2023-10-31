

import java.util.*;

public class Driver implements CollectionTest {
    private HashMap hashTable = new HashMap<Integer, Person>();

    private LinkedList linkedList = new LinkedList<Person>();

    private ArrayList arrayList = new ArrayList<Person>();

    private int size;

    public Driver() {
    }

    public static void main(String[] args)
    {
        Driver code = new Driver();
        code.runTest(CollectionType.LINKED_LIST, TestType.ADD, 5);
    }

    public void setSize(int size) {
        this.size = size;
        hashTable = new HashMap<Person, Integer>(size);
        arrayList = new ArrayList<Person>(size);
        linkedList = new LinkedList<Person>(arrayList);
    }

    public void runTest(CollectionType type, TestType test, int iterations) {
        long elapsedTime = 0;
        long[] iterationValues = new long[iterations];
        boolean Add = false, Index = false, Search = false;
        switch (test) {
            case ADD:
                Add = true;
                break;

            case INDEX:
                Index = true;
                break;

            case SEARCH:
                Search = true;
                break;
        }

        boolean Ll = false, Al = false, Hm = false;
        switch (type) {
            case LINKED_LIST:
                Ll = true;
                break;

            case ARRAY_LIST:
                Al = true;
                break;

            case HASH_MAP:
                Hm = true;
                break;
        }

        if (Ll && Add) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                Person person = new Person("Bob", 21);
                linkedList.add(person);
            }
            long endTime = System.currentTimeMillis();
            elapsedTime = endTime - startTime;

        } else if (Ll && Index) {

        } else if (Ll && Search) {

        }

        if (Al && Add) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                Person person = new Person("Bob", 21);
                arrayList.add(person);
            }
            long endTime = System.currentTimeMillis();
            elapsedTime = endTime - startTime;
        } else if (Al && Index) {

        } else if (Al && Search) {

        }

        if (Hm && Add) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                Person person = new Person("Bob", 21);
                hashTable.put(person, i);
            }
            long endTime = System.currentTimeMillis();
            elapsedTime = endTime - startTime;
        } else if (Hm && Index) {

        } else if (Hm && Search) {

        }

        System.out.println(elapsedTime);
    }
}