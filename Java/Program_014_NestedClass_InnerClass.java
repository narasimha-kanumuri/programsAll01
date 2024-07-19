class DataStructure {
    private final static int SIZE = 20;
    private int[] arr = new int[SIZE];
    
    DataStructure() {
        for (int i = 0; i < SIZE; ++i) {
            arr[i] = i * 10;
        }
    }

    public void printEven() {
        DataStructureIterator iterator = this.new EvenIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer> {    }

    private class EvenIterator
            implements DataStructureIterator {

        private int nextIndex = 0;

        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }
        
        public Integer next() {
            Integer evenIndexValue = Integer.valueOf(arr[nextIndex]);
            nextIndex += 2;
            return evenIndexValue;
        }
    }
}

public class Program_014_NestedClass_InnerClass {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
