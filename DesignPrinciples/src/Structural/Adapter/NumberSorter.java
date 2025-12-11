package Structural.Adapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberSorter {
    static List<Integer> sort(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }

    //this works however what if you have a primitive array?
//    public static void main(String[] args) {
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(0);
//        nums.add(7);
//        nums.add(74);
//        nums.add(5);
//        nums.add(4);
//        System.out.println(nums);
//        NumberSorter.sort(nums);
//        System.out.println(nums);
//    }

    // using adapter

    public static void main(String[] args) {
        int[] nums = {4,7,1,12};
        System.out.println(Arrays.toString(nums));
        SortListAdapter adap = new SortListAdapter();
        nums = adap.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

}


