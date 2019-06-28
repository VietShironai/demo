
public class MyListTest {
    public static void main(String[] args) {
        MyList listInterger = new MyList(5);
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(5);
        listInterger.add(6);
        System.out.println(listInterger.get(1));
        listInterger.removeAll();
        System.out.println(listInterger.size());

    }
}
