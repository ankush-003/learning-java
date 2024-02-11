package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayLists {
    public static void main(String[] args) {
        // pass wrapper class as type argument
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.contains(10));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int val : list) {
            System.out.println(val);
        }
    }
}
