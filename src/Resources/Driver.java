package src.Resources;

import java.util.*;

public class Driver implements CollectionTest {
    private HashMap hashTable = new HashMap<Person, Integer>();

    private LinkedList linkedList = new LinkedList<Person>();

    private ArrayList arrayList = new ArrayList<Person>();

    private int size;

    public Driver() {
    }

    public static void main(String[] args) {

    }

    public void setSize(int size) {
        this.size = size;
        hashTable = new HashMap<Person, Integer>(size);
        arrayList = new ArrayList<Person>(size);
        linkedList = new LinkedList<Person>(arrayList);
    }

    public void runTest(CollectionType type, TestType test, int iterations) {
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
                Person person = new Person("Bob", 21); // Assuming you have a Person class
                linkedList.add(person);
            }
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
        } else if (Ll && Index) {

        } else if (Ll && Search) {

        }


    }
}