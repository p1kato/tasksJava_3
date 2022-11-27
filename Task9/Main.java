package Task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int k = 0;

        int nums[] = new int[size];

        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
               k = k + 1;
            }
        }
        System.out.print(k);
    }
}
