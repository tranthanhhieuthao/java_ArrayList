public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> element = new MyList<Integer>();
        element.add(0,1);
        element.add(1,2);
        element.add(2,3);
        element.add(3,4);
        element.add(2,5);
        element.remove(2);

        for (int i=0;i<element.getSize();i++) {
            System.out.println(element.getdata(i));
        }
        System.out.print("Size of element: ");
        System.out.println(element.getSize());
        System.out.println(element.get(8));


    }
}
