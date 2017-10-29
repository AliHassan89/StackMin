/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci_chap3_stackmin;

/**
 *
 * @author Ali
 */
public class MinStack 
{
    private Node min;
    private Node stack;
    
    public void push(int val)
    {
        Node n = new Node();
        n.data = val;
        
        if (stack == null)
        {
            stack = n;
        }
        else
        {
            n.next = stack;
            stack = n;
        }
        
        if (min == null || min.data > val)
        {
            n.oldMin = min;
            min = n;
        }
    }
    
    public int pop()
    {
        if (stack == null)
        {
            throw new NullPointerException();
        }
        Node n = stack;
        stack = n.next;
        
        if (n.oldMin != null)
        {
            min = n.oldMin;
        }
        
        return n.data;        
    }
    
    public int min()
    {
        if (min == null)
        {
            throw new NullPointerException();
        }
        return min.data;
    }
    
}
