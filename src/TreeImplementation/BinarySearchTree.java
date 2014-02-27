/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TreeImplementation;

import java.util.Iterator;

/**
 *BinarySearchTreee class implements all abstract methods of the BinarySearchTreeADT
 * @author Isuru
 */
public class BinarySearchTree implements BinarySearchTreeADT {

    /**
     * tree specific fields
     */
    Node root;
    int size = 0;
    /**
     * check whether the tree is empty. returns the boolean value true if the tree is empty
     * @return 
     */
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }
    
    /**
     * returns the number of elements stored in the tree
     * @return 
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable positions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * returns the element stored as root/a reference to root element. returns null if the tree is empty
     * @return 
     */
    @Override
    public Node root() {
        if(size == 0)
            return null;
        else
            return root;
    }

    @Override
    public Node parent(Node child) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable children(Node parent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isInternal(Node position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isExternal(Node position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isRoot(Node position) {
        return (root == position);
    }

    @Override
    public Node replace(Node position, Node value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Node remove(Node position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Node left(Node position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Node right(Node position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasLeft(Node position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasRight(Node position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * this method traverse the tree in pre-order fashion. 
     * currently visit operation performs printNode method if node.
     * visit operation should be updated.
     * @param position 
     */
    @Override
    public void preOrder(Node position) {
        Node current = position;
        current.printBook();
        if(hasLeft(current))
        {
        
        }
    }

    @Override
    public void postOrder(Node position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inOrder(Node position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
