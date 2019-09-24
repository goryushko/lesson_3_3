//This program prints all numbers that have no division remainder while math division by "3" of "i" value being accomplished.
public class Task_2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

