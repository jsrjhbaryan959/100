package Days_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class medianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] nums1 = new int[n1];
        int[] nums2 = new int[n2];
        int[] nums3 = new int[n1 + n2];
//        int pos = 0;
        double med = 0;
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

//        1st Method to merge
        for(int i = 0; i< nums1.length; i++) {
            nums3[i] = nums1[i];
        }
        for (int i = 0; i< nums2.length; i++) {
            nums3[nums1.length+i] = nums2[i];
        }

//        for (int i = 0; i < (n1+n2); i++) {
//            System.out.print(nums3[i]);
//        }
//        System.out.println();


//        2nd Method to merge Arrays
//        List<Integer> list1 = new ArrayList<>();
//        for (int num : nums1) {
//            list1.add(num);
//        }
//        for (int num : nums2) {
//            list1.add(num);
//        }
//        Object[] listAdd = list1.toArray();
//        for (Object obj : listAdd) {
//            System.out.print(obj + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(listAdd));

        Arrays.sort(nums3);

//        System.out.println(Arrays.toString(nums3));
        if((nums3.length % 2) != 0){
            med = nums3[nums3.length/2];
        }
        else {
            med = (nums3[nums3.length/2] + nums3[(nums3.length/2)-1]) ;
        }
        System.out.println(med);


        System.out.println(Arrays.toString(nums3));
    }
}
