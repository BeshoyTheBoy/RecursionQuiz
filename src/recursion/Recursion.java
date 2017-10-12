/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author awadb3223
 */
public class Recursion {
    //**LOOP**
    //Returns the nth Fibonacci number
    // n - the nth number we want in the sequence
    public int fibLoop(int n) {
        //array to store squence
        int[] numbers = new int[n + 1];
        numbers[0] = 1;
        //boundary condition fix
        if(n > 0){
        numbers[1] = 1;
        }
        //building the sequence
        for (int i = 2; i < n + 1; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        //returning the number
        return numbers[n];
    }
    
    //**RECURSIVE**
    //calculate the nth fib number using RECURSION
    //n - is the nth number in the sequence
    public int fibR(int n){
        // BASE CASE
        if(n == 0 || n == 1){
            return 1;
        }else{
            return fibR(n-1) + fibR(n-2);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recursion test = new Recursion();
        int bound1 = test.fibLoop(0);
        System.out.println("0th: " + bound1);
        int bound2 = test.fibLoop(1);
        System.out.println("1st: " + bound2);
        int norm = test.fibLoop(5);
        System.out.println("5th: " + norm);
        System.out.println("---------------------");
        
        //RECURSIVE
        int boundR1 = test.fibR(0);
        System.out.println("0th: " + boundR1);
        int boundR2 = test.fibR(1);
        System.out.println("1st: " + boundR2);
        int normR = test.fibR(6);
        System.out.println("6th: " + normR);
    }
}
