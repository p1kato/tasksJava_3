package Task23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int array[] = new int[size];
        int sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        average = (double)(sum-(max + min)) / (array.length - 2);
        System.out.println(sum - (max + min));
        System.out.println(average);
    }
}

