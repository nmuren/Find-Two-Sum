package find_two_sum;

import java.util.HashSet;

public class Find_Two_Sum {

    static boolean nonDup(int[] list, int value) {
        HashSet<Integer> reverseSet = new HashSet();
        for (int i = 0; i < list.length; i++) {
            int temp = list[i];
            if (reverseSet.contains(temp)) {
                return true;
            }
            reverseSet.add(value-temp);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {4, 3, 2, 4, 1, 3, 2};
        int sum = 8;
        boolean found = nonDup(list, sum);
        System.out.println("Summation found status: " + found);
    }

}
