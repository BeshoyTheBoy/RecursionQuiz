/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awadb3223
 */
public class Quiz {
    
    public String reverseString(String word) {  
        //BASE CASE
        //if the word length is 0, return the word
        if (word.length() == 0 || word.length() <= 1) {
            return word;
            //Take first char and add it to end of the string
            //call method again until reaches base case
        }           
            return reverseString(word.substring(1)) + word.charAt(0);
            
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Quiz test = new Quiz();
        
        String word = "beshoy";
        
        System.out.println(test.reverseString(word));
        
    }
}
