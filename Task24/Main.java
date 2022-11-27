package Task24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int a = 0;
        int nums[] = new int[size];

        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        int m = in.nextInt();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == m){
                System.out.println("YES");
                System.out.println(i);
                break;
            }else{
                a++;
            }
        }
        if(a == nums.length) {
            System.out.print("NO");
        }
    }
}

