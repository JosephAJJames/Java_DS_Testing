
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
            for (int x = 0; x < iterations; x++) {
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < size; i++) {
                    Person person = new Person("Bob", 21);
                    hashTable.put(i, person);
                }
                long endTime = System.currentTimeMillis();
                elapsedTime = endTime - startTime;
                iterationValues[x] = elapsedTime;
            }
        } else if (Ll && Index) {
            for (int i = 0; i < size; i++) {
                Person person = new Person("Bob", 21);
                linkedList.add(person);
            }
            int min = 0;
            int max = size;

            Random random = new Random();
            for (int x = 0; x < iterations; x++) {
                int i = random.nextInt(max - min + 1) + min;
                long startTime = System.currentTimeMillis();
                Person person = (Person) linkedList.get(i);
                
                long endTime = System.currentTimeMillis();
                elapsedTime = endTime - startTime;
                iterationValues[x] = elapsedTime;
            }

        } else if (Ll && Search) {


            
        }

        if (Al && Add) {
            for (int x = 0; x < iterations; x++) {
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < size; i++) {
                    Person person = new Person("Bob", 21);
                    hashTable.put(i, person);
                }
                long endTime = System.currentTimeMillis();
                elapsedTime = endTime - startTime;
                iterationValues[x] = elapsedTime;
            }
        } else if (Al && Index) {


            for (int i = 0; i < size; i++) {
                Person person = new Person("Bob", 21);
                linkedList.add(person);
            }
            int min = 0;
            int max = size;

            Random random = new Random();
            for (int x = 0; x < iterations; x++) {
                int i = random.nextInt(max - min + 1) + min;
                long startTime = System.currentTimeMillis();
                Person person = (Person) arrayList.get(i);
                
                long endTime = System.currentTimeMillis();
                elapsedTime = endTime - startTime;
                iterationValues[x] = elapsedTime;
            }

            

        } else if (Al && Search) {



        }

        if (Hm && Add) {

            for (int x = 0; x < iterations; x++) {
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < size; i++) {
                    Person person = new Person("Bob", 21);
                    hashTable.put(i, person);
                }
                long endTime = System.currentTimeMillis();
                elapsedTime = endTime - startTime;
                iterationValues[x] = elapsedTime;
            }

        } else if (Hm && Index) {






        } else if (Hm && Search) {





        }

        System.out.println(elapsedTime);
    }
}