
package recursiongoodluck;

public class RecursionGOODLUCK {

    // 3 + 2 + 1
    public static int Summation( int n) {
        // Base case : WE ARE AT THE END
        if ( n <= 0) {
            return 0; // additive identity property
        }
        // recursive case : KEEP GOING
        else {
            // 3 + Summation(2)
            // 3 + 2 + Summation(1)
            // 3 + 2 + 1 + Summation(0)
            // 3 + 2 + 1 + 0
            return n + Summation( n-1);
        } 
    }
    
    public static int factorial( int n) {
        if( n <= 1) {
            return 1;
        }
        else {
            // 3 * Summation(2)
            // 3 * 2 * Summation(1)
            // 3 * 2 * 1
            return n * factorial(n-1);
        }
    }
    
    public static int exponential(int n, int p) {
        if ( p <= 0) {
            return 1;
        } else {
            // 5 * exponential(5, 2)
            // 5 * 5 * exponential(5, 1)
            // 5 * 5 * 5 * exponential(5, 0)
            // 5 * 5 * 5 * 1
            return n * exponential( n, p-1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(Summation(3));
        System.out.println(factorial(4));
        System.out.println(exponential(5, 3));
    }
    
}
