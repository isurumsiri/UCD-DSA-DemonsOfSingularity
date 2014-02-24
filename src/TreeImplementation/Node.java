package TreeImplementation;


import TreeImplementation.Book;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *represents a node in the bst.
 * a parameterized constructor is required.
 * @author Isuru
 */
public class Node extends Book{
    /**
     * three self referencing object references to parent, left child and right child.
     */
    Node parent, leftChild, rightChild;
}
