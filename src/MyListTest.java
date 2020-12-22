public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInt = new MyList<Integer>();

        listInt.add( 0);
        listInt.add( 1);
        listInt.add( 2);
        listInt.add( 3);
        listInt.add( 3);
        listInt.add( 6);
        listInt.remove(3);


        System.out.println(listInt.size);
        System.out.println(listInt.toString());
        System.out.println(listInt.constant(7));
        System.out.println(listInt.indexOf(6));
        System.out.println(listInt.get(2));
        listInt.clear();
        System.out.println(listInt.toString());
    }

}
