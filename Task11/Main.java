package Task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int sum = 0;
        double m = 0;

        int nums[] = new int[size];

        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }

        for(int i = 0; i < nums.length; i++){
                if(nums[i] % 2  == 0){
                    sum += nums[i];
                    m += 1;
                }

        }
        System.out.println(sum/m);

    }
}

