package dataStructures;

public class ArrayList implements List {
    private boolean isEmpty = true;
    private int size = 0;
    private int element;
    private int[] elements;
    public ArrayList(){
        elements = new int[3];
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

//    @Override
//    public void add(int element) {
//        //isEmpty = false;
//        elements[size++] = element;
//        //size++;
//
//    }
    @Override
    public void add(int element){
        boolean isFull = getCapacity() == size;
        if(isFull){
            int[] newArray = new int [elements.length * 2]; // create new array
            for(int i = 0; i < elements.length; i++){
                newArray[i] = elements[i];//copy content of old into new
            }
            elements = newArray; //swap old for new
        }
    }



    @Override
    public void remove(int element) {
        if(isEmpty()) throw new IllegalArgumentException("ArrayList is empty");
        //isEmpty = true;
        size--;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int get(int position) {
        return elements[position];
    }

    @Override
    public int getIndexOf(int element) {
        for(int i = 0; i < elements.length; i++){
            if(elements[i] == element){
                return i;
            }
        }
        return 0;
    }

    @Override
    public int getCapacity() {
        return elements.length;
    }


}
