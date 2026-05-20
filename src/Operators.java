public class Operators{

    
    public static void main(String[] args) {
        int a  = 11;
        int b = 5;
        int c = 6;
        int d = 6;
        boolean check = true;

        // //Unary Operator
    
        // System.out.println("Addition: " + (a + b));
        // System.out.println("Addition: " + (-a));
        // System.out.println("Addition: " + (+a + -b));
        // System.out.println("Addition: " + (-a + +b));
        // System.out.println("Addition: " + (!check));
        //System.out.println("Addition: " + (!a));
        
        //shift operators
        // left shift <<, right shift >>
        // System.out.println(a<<b);  // 5*2^4
        // System.out.println(5>>2);  // 5/2^2


        // //Relational Operators
        // // < , >, <=, >=, ==, != -- output always boolean
        // System.out.println("Relational: " + (a < b)); //false
        // System.out.println("Relational: " + (a > b)); // true
        // System.out.println("Relational: " + (a <= c)); //false
        // System.out.println("Relational: " + (c >= b)); //true
        // System.out.println("Relational: " + (c >= d));
        // System.out.println("Relational: " + (c <= d));
        // System.out.println("Relational: " + (a == b));
        // System.out.println("Relational: " + (a != b));

        // //bitwise operators
        // // | or, & and, ^ xor, ~ compliment
        // System.out.println("bitwise: " + (a ^ b)); // 1011 0101  - 1110
        // System.out.println("bitwise: " + (~a)); // 1011 - 0100

        // logical operator
        // &&, ||, !

        // System.out.println("Relational: " + ((c <= d) && (a == b))); // true & false - false
        // System.out.println("Relational: " + ((c <= d) || (a == b))); // true | false - true
        // System.out.println("Relational: " + !((c <= d) || (a == b)));

        // Assignment operator
        // =, +=, /=, %=

        System.out.println("Compund: " + (a%=b)); //11%=5 - 11%5  a
        System.out.println("Relational: " + a);
    }
}