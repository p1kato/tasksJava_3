package Task25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int nums[] = new int[size];
        double sum = 0;
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        int m = in.nextInt();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > m){
                k += 1;
                sum += nums[i];
            }
        }
        System.out.println(sum / k);
    }
}
