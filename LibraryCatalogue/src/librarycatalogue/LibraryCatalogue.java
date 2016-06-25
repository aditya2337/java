
package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    // Properties/Fields/G;obal Variables
    Map< String, Book> bookCollection = new HashMap< String, Book>();
    int currentDay = 0;
    int lengthOfCheckedPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;
    
    // Constructors
    public LibraryCatalogue( Map<String, Book> collection) {
        this.bookCollection = collection;
    }
    
    public LibraryCatalogue( Map<String,Book> collection, int lengthOfCheckedPeriod, 
            double initialLateFee, double feePerLateDay ) {
        this.bookCollection = collection;
        this.lengthOfCheckedPeriod = lengthOfCheckedPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }
    
    // Getters
    public int getCurrentDay() {
        return this.currentDay;
    }
    
    public int getLengthOfCheckedPeriod() {
        return this.lengthOfCheckedPeriod;
    }
    
    public double getInitialLateFee() {
        return this.initialLateFee;
    }
    
    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }
    
    public Map<String,Book> getBookCollection() {
        return this.bookCollection;
    }
    
    public Book getBook( String bookTitle) {
        return getBookCollection().get(bookTitle);
    }
    
    // Setters
    public void nextDay() {
        currentDay++;
    }
    
    public void setDay( int day) {
        currentDay = day; 
    }
    
    
    //INSTANCE METHODS
    public void checkOutBook( String title) {
        Book book = getBook(title);
        if( book.getIsCheckedOut()){
            sorryBookAlreadyCheckedOut( book);
        } else {
            book.setIscheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on"
                    + " day " + (getCurrentDay() + getLengthOfCheckedPeriod())
                    + ".");
        }
    }
    
    public void returnBook( String title) {
        Book book = getBook( title); 
        int daysLate = currentDay - ( book.getDayCheckedOut() + getLengthOfCheckedPeriod());
        if( daysLate > 0 ) {
            System.out.println( "You owe the library $" + ( getInitialLateFee() 
                    + daysLate * getFeePerLateDay()) + " because your book is " +
                     daysLate + " days overdue.");
        } else {
            System.out.println("Book returned. Thank you.");
        }
        book.setIscheckedOut(false, -1);
    }
    
    public void sorryBookAlreadyCheckedOut( Book book) {
        System.out.println( "Sorry, " + book.getTitle() + " is already checked "
                + "out. It should be back on day " + ( book.getDayCheckedOut() 
                        + getLengthOfCheckedPeriod()) + ".");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Map< String, Book> bookCollection = new HashMap< String, Book>();
        Book harry = new Book("Harry Potter: Priznor of Askaban", 100, 126456);
        bookCollection.put("Harry Potter", harry);
        
        LibraryCatalogue Lib = new LibraryCatalogue( bookCollection);
        Lib.checkOutBook("Harry Potter");
        Lib.nextDay();
        Lib.nextDay();
        Lib.checkOutBook("Harry Potter");
        Lib.setDay(17);
        Lib.returnBook("Harry Potter");
        Lib.checkOutBook("Harry Potter");
    }
    
}
