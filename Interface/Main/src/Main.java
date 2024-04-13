interface IntList {
    void add(int number);
    int get(int id);
}

class IntArrayList implements IntList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public IntArrayList() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int newCapacity = array.length + array.length /2 ; // Aumenta el tamaño en un 50%
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[id];
    }
}

class IntVector implements IntList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 20;

    public IntVector() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int newCapacity = array.length * 2; // Duplica el tamaño del arreglo
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[id];
    }
}

public class Main {
    public static void main(String[] args) {
        IntArrayList arrayList = new IntArrayList();
        arrayList.add(5);
        arrayList.add(10);
        System.out.println("Element at index 0 in IntArrayList: " + arrayList.get(0));

        IntVector vector = new IntVector();
        vector.add(15);
        vector.add(20);
        System.out.println("Element at index 1 in IntVector: " + vector.get(1));
    }
}
