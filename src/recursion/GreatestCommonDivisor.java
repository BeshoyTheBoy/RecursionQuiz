/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author awadb3223
 */
public class GreatestCommonDivisor {

    
    public int gcd(int a, int b){
        //swap if is lower number
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(b == 0){
            return a;
        }else{
            // find new values for a and b
            
            int r = a%b;
            // calculate new GCD
            return gcd(b,r);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GreatestCommonDivisor test = new GreatestCommonDivisor();
        System.out.println("------GCD TEST-------");
        System.out.println("GCD(1377,24)");
        int gcd = test.gcd(12,24);
        System.out.println("the GCD is " + gcd);
    }
}
