package bitwiseoperatordemo;

/**
 *
 * @author  Karan Sharma
 * @time     Jul 20, 2013 7:58:46 PM 
 */
public class BitwiseOperatorDemo {

    public static void main(String[] args) {
        
        int a = 10;     // binary value :  00000000 00000000 00000000 00001010
        int b = 2;      // binary value :  00000000 00000000 00000000 00000010
        
        // AND Operation
        System.out.println("a AND b  : " + (a & b) ); 
        // result : 

        //Inclusive OR operation
        System.out.println("a OR b  : " + (a | b) );

        //Exclusive OR operation
        System.out.println("a XOR b : " + (a ^ b) );  
        
    }

}
