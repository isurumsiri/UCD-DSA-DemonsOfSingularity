/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TreeImplementation;

import java.util.Iterator;

/**
 *specifies the ADT of binary search tree.
 *child in here is referring to a child node
 *parent in here is referring to a parent node
 *positing in here is referring to a reference variable of an object of type binary tree node
 *value in here is referring to a value to be inserted into an object; 
 *replace() methods should be overloaded so as to insert values for each field depending on implementation
 * @author Isuru
 */
public interface BinarySearchTreeADT {
	/*Generic methods*/
	public abstract boolean isEmpty();
	public abstract int size();
	public abstract Iterator iterator();
	public abstract Iterable positions();

	/*Accessor methods*/
	public abstract Node root();
	public abstract Node parent(Node child);
	public abstract Iterable children(Node parent);

	/*Query methods*/
	public abstract boolean isInternal(Node position);
	public abstract boolean isExternal(Node position);
	public abstract boolean isRoot(Node position);

	/*Update metods*/
	public abstract Node replace(Node position, Node value);
	public abstract Node remove(Node position);

	/*Binary Tree specific methods*/
	public abstract Node left(Node position);
	public abstract Node right(Node position);
	public abstract Node hasLeft(Node position);
	public abstract Node hasRight(Node position);

	/*Traversing methods*/
	public abstract void preOrder(Node position);
	public abstract void postOrder(Node position);
	public abstract void inOrder(Node position);

}
