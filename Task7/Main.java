package Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int nums[] = new int[size];

        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        for(int i = 0; i < nums.length; i++){
           if(i % 2 == 0){
               System.out.print(nums[i] + " ");
           }
        }
    }
}
