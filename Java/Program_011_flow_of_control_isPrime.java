public class Program_011_flow_of_control_isPrime {
    

    //If number is not a prime number-We found a facor, no need to continue the loop
    //If number is very large, but a prime number

    //Print if n is prime or not
    public void isPrime(int n) {
        //n = n - 1
        int sqrt = (int)Math.pow(n,0.5) + 1;
        for (int i = 2; i <= sqrt; i++) {
            //System.out.println(i);
            if (n % i == 0) {
                System.out.println(n + " is not Prime");
                //break;
                return;
            }
        }
        System.out.println(n + " is Prime");
    }
    
    
    public static void main(String[] args) {

        Program_011_flow_of_control_isPrime obj;
        obj = new Program_011_flow_of_control_isPrime();
        
        int n = 1000003;//7 digit prime
        //long n = 100;
        obj.isPrime(n);
    }
}
