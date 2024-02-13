import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        /*
            Java code to calculate the sum, count, average, and
            check the primality of even and odd numbers for numbers 
            from 1 to n.
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 'n' value:");
        int n = input.nextInt();
        
        int even_sum = 0, even_count = 0; 
        int odd_sum = 0, odd_count = 0;
        int prime_sum = 0, prime_count = 0;
        boolean is_prime=true;

        for(int i = 2; i < n; i++){
            is_prime=true;
            for (int j = 2; j<i; j++){
                if(i%j==0){
                    is_prime=false;
                    break;
                }    
            }
            if(is_prime){

              prime_sum+=i;
              prime_count++;
            }
            if(i % 2 == 0){
                even_sum += i;
                even_count++;
            } else{
                odd_sum += i;
                odd_count++;
            }
            
        }
        System.out.println("sum of even numbers: " + even_sum + " - " + "numbers of even numbers: " + even_count);
        System.out.println("sum of odd numbers: " +odd_sum + " - " + "numbers of odd numbers: " + odd_count);
        System.out.println("Average of the even numbers: " + (even_sum / (even_count * 1.0)));
        System.out.println("Average of the odd numbers: " + (odd_sum / (odd_count * 1.0)));
        System.out.println("sum of prime numbers: " +prime_sum + " - " + "numbers of prime numbers: " + prime_count);
    }
}
