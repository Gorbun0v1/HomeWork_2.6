import java.util.*;

public class Main {
    public static void main(String[] args) {
        //***********************
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }
        //***********************
        List<Integer> nums2 = new ArrayList<>(List.of(3, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        HashSet<Integer> numSet = new HashSet<>(nums2);
        nums2 = new ArrayList<>(numSet);
        Collections.sort(nums2);
        System.out.println(nums2 );
        //***********************
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        int count = 1;
        for (int i = 0; i < strings.size() - 1; i++) {
            if (strings.get(i).equals(strings.get(i + 1))) {
                count++;
            } else {
                System.out.println(count);
                count = 1;
            }
        }
        System.out.println(count);
    }
}