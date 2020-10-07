import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BigInteger num = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger[] arrayOfNums = new BigInteger[10];
        int size = 0;

        while (size < 10) {
            num = num.add(new BigInteger("1"));
            BigInteger remainder5 = num.mod(new BigInteger("5"));
            BigInteger remainder6 = num.mod(new BigInteger("6"));
            BigInteger zero = new BigInteger("0");

            if ((remainder5.compareTo(zero)) == 0 || (remainder6.compareTo(zero)) == 0) {
                arrayOfNums[size] = num;
                size++;
            }

        }

        System.out.println(Arrays.toString(arrayOfNums));
    }
}
