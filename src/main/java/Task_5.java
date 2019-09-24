//Write a function which calculates and returns the minimum of 4 arguments.
public class Task_5 {


    public static void main(String[] args) {
        // write your code here
        int a = 33;
        int b = 55;
        int c = 44;
        int d = 99;
        System.out.println(min(a, b, c, d));

    }

    public static int min(int a, int b, int c, int d) {
        if (min(a, b) > c && d > c) {
            return c;
        }
        if (min(a, b) > d && c > d) {
            return d;
        } else {
            return min(a, b);
        }
    }

    public static int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}

