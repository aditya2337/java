/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplebinary;

import java.util.Scanner;

/**
 *
 * @author GV
 */
public class SimpleBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = "";
        
        while( n > 0 ) {
           
            int rem = n%2;
            binary = rem + binary;
             n = n/2;
        }
        System.out.println(binary);
    }
    
}
