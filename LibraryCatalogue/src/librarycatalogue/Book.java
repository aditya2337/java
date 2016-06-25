
package librarycatalogue;

public class Book {
    // Properties, Fields, Global Variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;// whether or not it is checked out
    int dayCheckedOut = -1;
    
    // Constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN){
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
    }
    
    // Getters --> INSTANCE METHODS
    public String getTitle() {
        return this.title;
    }
    
    public int getPageCount() {
        return this.pageCount;
    }
    
    public int getISBN() {
        return this.ISBN;
    }
    
    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }
    
    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }
    
    // Setters
    public void setIscheckedOut(boolean newIscheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = newIscheckedOut; 
        setDayCheckedOut( currentDayCheckedOut);
    }
    
    private void setDayCheckedOut( int day) {
        this.dayCheckedOut = day;
    }
}
