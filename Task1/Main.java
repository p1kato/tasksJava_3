package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {6,19,26,9,46,8,5,65,90,25};
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        for(int i = 0; i < nums.length; i++){
            if(i == x){
                System.out.println(nums[i]);
                break;
            }
        }

    }
}
