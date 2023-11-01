// A HashSet is a data structure in programming that stores a collection of unique elements, meaning it doesn't allow duplicate values. It offers fast and efficient operations for adding, removing, and checking the presence of elements.

import java.util.HashSet;
import java.util.Set;

class RemoveDuplicate {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 8 };
        boolean hasDuplicates = RemoveDuplicate.containsDuplicate(nums);
        System.out.println("Conatins Duplicates: " + hasDuplicates);

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            if (numSet.contains(num)) {
                return true; // Found a duplicate
            }

            numSet.add(num);
        }

        return false;

    }

}
