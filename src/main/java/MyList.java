public class MyList implements List {
    private int size = 0;
    private static final int DEFAUL_CAPACITY = 10;
    private Object[] myObj;

    public MyList() {
    }

    public MyList(int size) {
        myObj = new Object[size];

    }

    protected void createnewArray() {
        int newsize = myObj.length * 2;
        myObj = new Object[newsize];
    }

    @Override
    public void add(Object e) {
        if (size == myObj.length) {
            createnewArray();
        }
        myObj[size++] = (Object) e;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        return myObj[index];
    }

    @Override
    public Object remove(int index) {
        Object o = myObj[size];
        for (int i = index; i < size - 1; i++) {
            myObj[i] = myObj[i + 1];

        }
        myObj[size - 1] = null;
        return myObj;
    }

    @Override
    public void removeAll() {
        size=0;
        myObj
    }

    @Override
    public void replace(int index, Object e) {
        myObj[index] = e;
    }

}