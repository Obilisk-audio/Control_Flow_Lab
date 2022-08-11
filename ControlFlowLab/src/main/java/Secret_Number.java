import java.util.Random;
import java.util.Scanner;

public class Secret_Number {
    public static void main(String[] args){

        //Scanner Class
        Scanner sc= new Scanner(System.in);

        //welcome player - give instructions
        System.out.println("Welcome to the amazing Secret Number Game! \nWhen you're ready, guess a number between 0-5 then press enter!");

        //generate random number between 0-20
        Random rand = new Random();
        int upperbound = 6;
        int int_random = rand.nextInt(upperbound);

        //Ask user to input number
        System.out.print("Enter your number- ");
        int a = sc.nextInt();

        // if player input is larger or smaller than secret number - print message
        if (a > int_random){
            System.out.println("Ah, too high!");
        } else if (a < int_random) {
            System.out.println("Ah, too low!");
        }

        // if player input is outside of range - print message
        if (a > 21){
            System.out.println("Way too high! Did you read the instructions?");
        } else if (a < 0) {
            System.out.println("Way too low! Did you read the instructions?");
        }

        // if player input is secret number - print congratulations
        if (a == int_random){
            System.out.println("Hooray you guessed the secret number! You are possibly the smartest person in the universe!");
        }

        // tell the player the secret number
        System.out.println("The number was " + int_random);

        //I tried to nest code within a while loop to allow user to try again, but it proved too difficult at this stage.

    }

}