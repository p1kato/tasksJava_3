package Task30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        int a = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        if(nums[0] >= 0) {
            for(int i=0; i<nums.length; i+=2) {
                if(nums[i] >= 0) {
                    a++;
                }
            }
            for(int j = 1; j < nums.length; j += 2) {
                if(nums[j] < 0) {
                    a++;
                }
            }
            if(a == nums.length){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }else if(nums[0] < 0){
            for(int i = 1; i < nums.length; i += 2) {
                if(nums[i] >= 0) {
                    a++;
                }
            }
            for(int j=0; j<nums.length; j+=2) {
                if(nums[j] < 0) {
                    a++;
                }
            }
            if(a == nums.length){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}