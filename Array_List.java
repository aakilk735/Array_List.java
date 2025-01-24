import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        System.out.println("Insertion");
        arr.add(1);
        arr.add(5);
        arr.add(9);
        System.out.println(arr);
        arr.remove(0);
        System.out.println("Deletion");
        System.out.println(arr);
        System.out.println("Insert at position");
        arr.add(1,10);
        System.out.println(arr);

    }
}
