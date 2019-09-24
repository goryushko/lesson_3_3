//This program fills the array of numbers from 100 to 0.

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] a = new int[101];
        for (int i = 0; i < 101; i++)
            a[i] = i;
        System.out.println(Arrays.toString(a));

    }
}
