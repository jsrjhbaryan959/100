package Days_100;

import java.util.*;

public class addToArrayFormOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        StringBuilder str = new StringBuilder();
        for (int i : arr) {
            str.append(i);
        }
        int convertedN = Integer.parseInt(String.valueOf(str)) + k;
        System.out.println(Integer.parseInt(String.valueOf(str)));
        System.out.println(convertedN);
        String temp = Integer.toString(convertedN);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = Character.getNumericValue(temp.charAt(i));
        }
        System.out.println(Arrays.toString(numbers));
    }
}




//        LeetCode Solution
        class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int p = num.length - 1;
        int carry = 0;
        while (p >= 0 || k > 0) {
            int numVal = 0;
            if (p >= 0) {
                numVal = num[p];
            }
            int d = k % 10;
            int sum = numVal + d + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ans.add(digit);
            p--;
            k = k / 10;
        }
        if (carry > 0) {
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }
}
