/*
 * Write a program that prints sum of all integers from 1 to 100
 */
package sum1_100;

/**
 * @author aczerska
 */
public class Sum1_100 {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        
        while (y <= 100) {
            x = x + y;
            y++;
        }
        System.out.println(x);        
    }
    
}
