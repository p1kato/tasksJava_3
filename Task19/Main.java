package Task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int min = 99999;

        int nums[] = new int[size];

        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println(min * min);
    }
}
