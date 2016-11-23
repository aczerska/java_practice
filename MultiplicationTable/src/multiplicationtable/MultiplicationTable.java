/*
 * Task: 
 * Write a program that prints multiplication table like this one:
 * 1 * 1 = 1
 * 1 * 2 = 2
 * 1 * 3 = 3
 * ...
 * 1 * 10 = 10
 * 2 * 1 = 2
 * 2 * 2 = 4
 * ...
 * 2 * 10 = 20
 *...
 * 10 * 10 = 100
 */
package multiplicationtable;

/**
 * @author aczerska
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        int x = 1;
        int z;
        
        while (x <= 10)  {
            
            int y = 1;
            
            while (y <= 10) {
                
                z = x * y;
                System.out.println(x + " * " + y + " = " + z);
                y++;
            }
            
            x++;
        }
    }
    
}
