import java.util.Scanner;

public class Factorial {
        public static void main(String[] args) throws Exception {
                Scanner scanner = new Scanner(System.in);

                int input = scanner.nextInt();
                System.out.printf("Factorial(%d) = %d\n", input, Factorial(input));
        }

        public static int Factorial(int n) throws Exception {
                int result;

                if (n < 0)
                        throw new Exception("Invalid input.");

                if (n == 0)
                        return 1;

                result = n;
                while (--n > 0)
                        result *= n;

                return result;
        }
}
