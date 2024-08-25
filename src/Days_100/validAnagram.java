package Days_100;

import java.util.HashMap;
import java.util.Scanner;

public class validAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(hm.containsKey(ch) == true){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (hm.containsKey(ch) == true){
                if(hm.get(ch) == 1){
                    hm.remove(ch);
                }
                else {
                    hm.put(ch, hm.get(ch)-1);
                }
            }
            else{
                System.out.println("false");
            }
        }
        if(hm.size() == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
