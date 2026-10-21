
import java.util.*;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;

        for (int candy : aliceSizes) {
            sumA += candy;
        }

        for (int candy : bobSizes) {
            sumB += candy;
        }

        int diff = (sumA - sumB) / 2;

        Set<Integer> set = new HashSet<>();

        for (int candy : aliceSizes) {
            set.add(candy);
        }

        for (int candy : bobSizes) {
            int aliceCandy = candy + diff;

            if (set.contains(aliceCandy)) {
                return new int[]{aliceCandy, candy};
            }
        }

        return new int[]{};
    }
}
