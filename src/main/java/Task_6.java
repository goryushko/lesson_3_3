//    Write a method named getEvenDigitSum with one parameter of type int called number.
//    The method should return the sum of the even digits within the number.
//    If the number is negative, the method should return -1 to indicate an invalid value.
//      NOTE: The method getEvenDigitSum should be defined as public static.
//      NOTE: Do not add a main method to the solution code.
public class Task_6 {

    public static class EvenDigitSum {
        public static int getEvenDigitSum(int number) {
            if (number < 0) return -1;
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                number = number / 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
            }
            return sum;
        }
    }
}
