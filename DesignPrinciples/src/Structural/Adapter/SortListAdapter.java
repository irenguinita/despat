package Structural.Adapter;

import java.util.ArrayList;
import java.util.List;

public class SortListAdapter implements Sorter{
    public int[] sort(int[] numbers) {
        //convert primitive to list
        List<Integer> nums = new ArrayList<>();
        for(int i : numbers) {
            nums.add(i);
        }

        NumberSorter.sort(nums);
        // convert back to primitive
        for (int i = 0; i<numbers.length; i++) {
            numbers[i] = nums.get(i);
        }
        return numbers;
    }



}
