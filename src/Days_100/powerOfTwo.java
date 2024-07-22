package Days_100;

import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //1st Method
        if(n==1){
            System.out.println("true");
        }
        int count = 0;
        for (int i = 0; i < 31; i++) {
            if(Math.pow(2, i) == n){
//                System.out.println("true");
                count+=1;
                break;
//                System.out.println("true");
//                count+=1;
            }
            else{
                count = 0;
            }
        }
        if(count > 0) {
            System.out.println("true");
//            System.out.println(count);
        }
        else {
            System.out.println("false");
//            System.out.println(count);
        }
//        System.out.println();


        //2nd Method
        if(n==0){
            System.out.println("false");
        }
        while (n%2 == 0){
            n = n / 2;
        }
        if (n==1){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
