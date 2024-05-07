package structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterExample {
    public static void main(String[] args) {
        Integer[] arrayOfInts = {1, 2, 3, 4, 5, 6};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        System.out.println(Arrays.toString(arrayOfInts));
        System.out.println(listOfInts);
    }
}
