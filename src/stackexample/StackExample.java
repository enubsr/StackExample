/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackexample;

import singlylinkedlist.SNode;

/**
 *
 * @author Enubs
 */
public class StackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SNode<String> node1 = new SNode("node1", null);
        SNode<String> node2 = new SNode("node2", null);
        SNode<String> node3 = new SNode("node3", null);
        SNode<String> node4 = new SNode("node4", null);
        SNode<String> node5 = new SNode("node5", null);
        
        LinkedStack<SNode> stack = new LinkedStack<>();
        stack.push(node1);
        stack.push(node2);
        stack.push(node3);
        stack.push(node4);
        stack.push(node5);
        
        stack.showStack();
        stack.pop();
        System.out.println();
        stack.showStack();
        
    }
    
    
}
