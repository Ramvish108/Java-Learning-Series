import java.util.*;

class NumberGuess{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();

        int secret=r.nextInt(100)+1;
        int guess=0;
        int attempt=0;

        System.out.println("Welcome to Game of Number :");
        System.out.println("Guess the Number between 1-100");

        while(guess !=secret){
            System.out.print("Enter your num:");
            guess=sc.nextInt();
            attempt++;

            if(guess<secret){
                System.out.println("Number is Bigger then you guess !");

            }
            else if (guess>secret){
                System.out.println("Number is Smaller that your guess !");
            }
            else{
                System.out.println("Congratulation youb crack the software !");

            }
        }

    }
}