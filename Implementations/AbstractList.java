package algorithms;

public abstract class AbstractList {

    public AbstractList() {

    }

    public abstract int size();

    public abstract void add(int value);

    public abstract int get(int index);

    public abstract void remove(int index);

    public abstract void set(int index, int value);
   
}
