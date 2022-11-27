package Task20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int max = -9999;
        int k = 0;

        int nums[] = new int[size];

        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                k = i;
            }
        }
        System.out.print(max + " " + k);
    }
}