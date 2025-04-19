package recursion;

public class aramstrong {
        public static void main(String[] args) {
            int testNumber = 153;
            if (isArmstrong(testNumber))
            {
                System.out.println(testNumber + " is an Armstrong number.");
            } else
            {
                System.out.println(testNumber + " is not an Armstrong number.");
            }
        }
        public static boolean isArmstrong(int number)
        {
            int length = String.valueOf(number).length();
            return isArmstrongRecursive(number, length, 0);
        }
        private static boolean isArmstrongRecursive(int number, int length, int sum)
        {
            if (number == 0)
            {
                return sum == 0;
            }
            int digit = number % 10;
            sum += (int) Math.pow(digit, length);
            return isArmstrongRecursive(number / 10, length, sum);
        }
    }

