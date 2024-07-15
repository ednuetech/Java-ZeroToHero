import java.math.BigInteger;
import java.util.*;

/**
 * This class compares the input numbers with the range of primitive data types and prints where the number can be fitted.
 */
public class DataTypeCompare {

    /**
     * Reads input numbers, compares them with the range of primitive data types, and prints where each number can be fitted.
     *
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            try {
                BigInteger num = scanner.nextBigInteger();
                boolean canBeFitted = false;

                // Check for each data type and print if it fits
                if (num.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                        num.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                    System.out.println(num + " can be fitted in:");
                    System.out.println("* byte");
                    canBeFitted = true;
                }
                if (num.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                        num.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                    if (!canBeFitted) System.out.println(num + " can be fitted in:");
                    System.out.println("* short");
                    canBeFitted = true;
                }
                if (num.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                        num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    if (!canBeFitted) System.out.println(num + " can be fitted in:");
                    System.out.println("* int");
                    canBeFitted = true;
                }
                if (num.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                        num.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    if (!canBeFitted) System.out.println(num + " can be fitted in:");
                    System.out.println("* long");
                    canBeFitted = true;
                }

                if (!canBeFitted) {
                    System.out.println(num + " can't be fitted anywhere.");
                }
            } catch (Exception e) {
                // If the number is too large to fit in any primitive type
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}