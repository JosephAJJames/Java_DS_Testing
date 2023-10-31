import java.util.*;

public class Driver implements CollectionTest{
    private HashMap hashTable = new HashMap<Person, Integer>();

    private LinkedList linkedList = new LinkedList<Person>();

    private ArrayList arrayList = new ArrayList<Person>();

    public Driver(){}

    public static void main(String[] args)
    {

    }

    public void setSize(int size)
    {
        hashTable = new HashMap<Person, Integer>(size);
        arrayList = new ArrayList<Person>(size);
        linkedList = new LinkedList<Person>(arrayList);
    }

    public void runTest(CollectionType type, TestType test, int iterations)
    {

        boolean testMy()
        {

        }


        boolean Add, Index, Search = false;
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

        boolean Ll, Al, Hm = false;
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

        if (Ll) {
            if () {

            }



        } else if (Al) {




        } else if (Hm) {




        }

    }
}