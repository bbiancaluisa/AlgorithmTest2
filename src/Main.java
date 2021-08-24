import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        System.out.println ("Enter a number:");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int sum = 0;
        int input = number;
        while (input != 0 ){
            int lastdigit = input % 10;
            sum += lastdigit;
            input /= 10;
        }

        System.out.println("The sum of digits of the number " +number + " is " + sum);

        // closing Scanner to prevent resource leak.
        sc.close();


    }
}
