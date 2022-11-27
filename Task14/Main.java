package Task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int sum = 0;
        int nums[] = new int[size];

        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        for(int i = 0; i < nums.length; i++){
           sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > sum / nums.length){
                System.out.print(nums[i] + " ");
            }
        }

    }
}


