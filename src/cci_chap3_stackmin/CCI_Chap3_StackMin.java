/*
    Stack Min: How would you design a stack which, in addition to push and pop, 
    has a function min which returns the minimum element? Push, pop and min 
    should all operate in 0(1) time.
 */
package cci_chap3_stackmin;

/**
 *
 * @author Ali
 */
public class CCI_Chap3_StackMin 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(7);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        
        System.out.println("Min:    "+stack.min()+"     pop value:   "+stack.pop());
        System.out.println("Min:    "+stack.min()+"     pop value:   "+stack.pop());
        System.out.println("Min:    "+stack.min()+"     pop value:   "+stack.pop());
        System.out.println("Min:    "+stack.min()+"     pop value:   "+stack.pop());
        System.out.println("Min:    "+stack.min()+"     pop value:   "+stack.pop());
        
    }
    
}
