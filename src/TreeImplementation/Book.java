package TreeImplementation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *book class represent all data fields and methods required by a single book record in the 
 * database(BST).
 * book class is required to have a parameterized constructor.
 * @author Isuru
 */
public abstract class Book {
    /**
     * data fields of a book record
     */
    String bookTitle = "";
    String authorFName = "";
    String authorSurname = "";
    int ISBN;
    
    /**
     * printBook method should be update according to the implementation of 
     * the binary tree. here is uses command prompt as std output. Use appropriate 
     * implementation specific method at the GUI design stage;
     */
    public void printBook(){
        System.out.println("Book Title: "+bookTitle);
        System.out.println("Author Name: "+authorFName+" "+authorSurname);
        System.out.println("ISBN: "+ISBN);
    }
}
