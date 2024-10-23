import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int myNumber =(int) (Math.random()*100);
        int userNumber;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Guess the number: ");
            userNumber = sc.nextInt();
            if(userNumber == myNumber)
            {
                System.out.println("Yesssss. Correct Answer!");
                break;
            }
            else if(userNumber > myNumber) {
                System.out.println("The number is too high");

            }
            else{
                    System.out.println("The number is too low");

            }
        }while(userNumber>=0);
            {
                System.out.println("The number was: ");
                System.out.println(myNumber);
            }


    }
}
