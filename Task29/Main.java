package Task29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        int sum = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                x = i;
                break;
            }
        }
        for(int i = x + 1; i < nums.length; i++){
            if(nums[i] == 0){
                y = i;
                break;
            }
        }
        for(int i = x + 1; i < y; i++){
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
