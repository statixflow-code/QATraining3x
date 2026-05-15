public class App {

    static boolean check = true;
    int alpha = 15;
    char single = '$';

    public void temp(){
        double y = 10.2;

        ++alpha;
        System.out.println("My alpha: " + alpha);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int yash = 10;
        System.out.println("My x: " + yash);
        check = false;
        
        // sal.temp();
        // sal.secondTemp();
        long large = 4568746546564l;




        App sal = new App();

        String name = new String("Yash Ramteke");
        //yash++;
    }

    

    public void secondTemp(){
        float f = 10.23f;
        // System.out.println("My x: " + yash);
        // System.out.println("My y: " + y);
        System.out.println("My boolean check: " + check);
        System.out.println("My alpha in secondTemp: " + alpha);
        System.out.println("My check in secondTemp: " + check);
    }
}
