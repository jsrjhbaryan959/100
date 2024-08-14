package Days_100;

import java.util.Arrays;
import java.util.Scanner;

public class boatToSavePeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt();
        }
        int limit = sc.nextInt();

        Arrays.sort(people);
        int count = 0;
        int start = 0;
        int end = people.length-1;
        while(start <= end){
            if(people[start] + people[end] <= limit){
                start++;
                end--;
            }

            else {
                end--;
            }
            count++;
        }
        System.out.println(count);
    }
}
