package com.test;

import java.time.LocalDateTime;
import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));

        Solution solution = new Solution();
//        System.out.println("==>" + solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 6, 6, 7, 7}));
//        System.out.println("==>" + solution.removeDuplicates(new int[]{1, 1, 2, 3}));

        LocalDateTime.now();

    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] scrArray = str.toCharArray();
        return recus(scrArray, 0, scrArray.length - 1);
    }

    public static boolean recus(char[] scrArray, int x, int y) {
        System.out.println("## x = " + x + ", y = " + y);
        if (x == y || (x + 1 == y && scrArray[x] == scrArray[y])) {
            return true;
        }
        if (scrArray[x] != scrArray[y] || x > y) {
            return false;
        }
        return recus(scrArray, ++x, --y);
    }

    public static boolean isPalindrome1(int x) {
        String str = String.valueOf(x);
        char[] scrArray = str.toCharArray();

        int endIdx = scrArray.length;
        int middleIdx = scrArray.length / 2;
        int startInx = middleIdx;

        if (scrArray.length % 2 != 0) {
            startInx = middleIdx + 1;
        }

        char[] charA = Arrays.copyOfRange(scrArray, 0, middleIdx);
        char[] charB = Arrays.copyOfRange(scrArray, startInx, endIdx);

        StringBuilder sb = new StringBuilder();
        for (int i = charB.length - 1; i >= 0; i--) {
            sb.append(charB[i]);
        }

        String strA = new String(charA);
        System.out.println(strA);

        String strC = sb.toString();
        System.out.println(strC);


        return strA.equals(strC);
    }

    public int removeDuplicates(int[] nums) {
        int[] newArray = Arrays.stream(nums).distinct().toArray();
        return newArray.length;
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{0, 0};
    }

}