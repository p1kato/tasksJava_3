package Task27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        int max = array[0];
        int min = array[0];
        int max_index = 0;
        int min_index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                max_index = i;
            } else if (array[i] < min) {
                min = array[i];
                min_index = i;
            }
        }
        array[max_index]= min;
        array[min_index] = max;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

