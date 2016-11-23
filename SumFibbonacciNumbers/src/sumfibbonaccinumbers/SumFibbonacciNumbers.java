/*
 * Write a program that prints Fibbonacci numbers from 0 to 1000 and prints sum of all these numbers
 */
package sumfibbonaccinumbers;

/**
 * @author aczerska
 */
public class SumFibbonacciNumbers {

    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        int z = 1;
        int next = y + z;
        int sum = x + y + z;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        while (next < 900) {

            next = y + z;
            y = z;
            z = next;

            System.out.println(next);

            sum = sum + next;

        }
        System.out.println(sum);

    }

}
