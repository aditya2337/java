
package binary;

import java.util.Scanner;


public class Binary {

    
    
    public static String showBinary(int d) {
        
        if (d == 0) {
            return "0";
        }
         String binary = "";
        while( d > 0) {
            
            int rem = d%2;
            binary = rem + binary;
            d = d/2;
           // d = quotient%2;
            //return d; 
        }
        return "binary = " + binary; 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" please enter a digit and press enter to know its "
                + "binary form");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(showBinary(n));
    }
    
}
