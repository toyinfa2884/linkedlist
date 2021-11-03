package dataStructures;

public interface List {
    boolean isEmpty();

    void add(int element);

    void remove(int element);

    int size();

    int get(int position);

    int getIndexOf(int element);

    int getCapacity();
}
